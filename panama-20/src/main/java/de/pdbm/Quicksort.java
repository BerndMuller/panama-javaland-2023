package de.pdbm;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

/**
 * Simple example to call C from Java as well as Java from C
 * 
 * <p>
 * Based on https://github.com/openjdk/panama-foreign/blob/foreign-jextract/doc/panama_ffi.md
 * 
 * @author bernd
 *
 */
public class Quicksort {

	public static void main(String[] args) throws Throwable {
		qsort();
	}
	
    static class IntComparator {
    	
        static int compare(MemorySegment addr1, MemorySegment addr2) {
        	return addr1.get(JAVA_INT, 0) - addr2.get(JAVA_INT, 0);
        }

    }

    public static void qsort() throws Throwable {
    	
    	MethodHandle qsort = Linker.nativeLinker().downcallHandle(
    			Linker.nativeLinker().defaultLookup().find("qsort").get(),
        	    //FunctionDescriptor.ofVoid(ADDRESS.asUnbounded(), JAVA_LONG, JAVA_LONG, ADDRESS.asUnbounded())
    			FunctionDescriptor.ofVoid(ADDRESS, JAVA_LONG, JAVA_LONG, ADDRESS)
        	);

    	FunctionDescriptor compareDescriptor = FunctionDescriptor.of(JAVA_INT, ADDRESS.asUnbounded(), ADDRESS.asUnbounded());
    	//FunctionDescriptor compareDescriptor = FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS);
        MethodHandle compareHandle = MethodHandles.lookup().findStatic(IntComparator.class,
                                                        "compare",
                                                        //Linker.upcallType(compareDescriptor));
                                                        compareDescriptor.toMethodType());
        
        try (Arena arena = Arena.openConfined()) {
        	MemorySegment comparFunc = Linker.nativeLinker().upcallStub(compareHandle, compareDescriptor, arena.scope());
        	MemorySegment array = arena.allocateArray(JAVA_INT, new int[] { 0, 9, 3, 4, 6, 5, 1, 8, 2, 7 });
        	qsort.invokeExact(array, 10L, 4L, comparFunc);
        	int[] sorted = array.toArray(JAVA_INT); // [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
        	System.out.println(Arrays.toString(sorted));
        }        
        
    }
	
}
