// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor syscall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle syscall$MH = RuntimeHelper.downcallHandleVariadic(
        "syscall",
        constants$18.syscall$FUNC
    );
    static final FunctionDescriptor lockf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lockf$MH = RuntimeHelper.downcallHandle(
        "lockf",
        constants$18.lockf$FUNC
    );
    static final FunctionDescriptor fdatasync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fdatasync$MH = RuntimeHelper.downcallHandle(
        "fdatasync",
        constants$18.fdatasync$FUNC
    );
    static final FunctionDescriptor crypt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypt$MH = RuntimeHelper.downcallHandle(
        "crypt",
        constants$18.crypt$FUNC
    );
    static final FunctionDescriptor getentropy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getentropy$MH = RuntimeHelper.downcallHandle(
        "getentropy",
        constants$18.getentropy$FUNC
    );
    static final MemorySegment __ILP32_OFF32_CFLAGS$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("-m32");
}

