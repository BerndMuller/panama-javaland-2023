// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor access$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle access$MH = RuntimeHelper.downcallHandle(
        "access",
        constants$0.access$FUNC
    );
    static final FunctionDescriptor faccessat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle faccessat$MH = RuntimeHelper.downcallHandle(
        "faccessat",
        constants$0.faccessat$FUNC
    );
    static final FunctionDescriptor lseek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle lseek$MH = RuntimeHelper.downcallHandle(
        "lseek",
        constants$0.lseek$FUNC
    );
    static final FunctionDescriptor close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle close$MH = RuntimeHelper.downcallHandle(
        "close",
        constants$0.close$FUNC
    );
    static final FunctionDescriptor closefrom$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle closefrom$MH = RuntimeHelper.downcallHandle(
        "closefrom",
        constants$0.closefrom$FUNC
    );
    static final FunctionDescriptor read$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle read$MH = RuntimeHelper.downcallHandle(
        "read",
        constants$0.read$FUNC
    );
}

