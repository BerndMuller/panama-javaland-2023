// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$14 {

    static final FunctionDescriptor gethostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gethostname$MH = RuntimeHelper.downcallHandle(
        "gethostname",
        constants$14.gethostname$FUNC
    );
    static final FunctionDescriptor sethostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle sethostname$MH = RuntimeHelper.downcallHandle(
        "sethostname",
        constants$14.sethostname$FUNC
    );
    static final FunctionDescriptor sethostid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle sethostid$MH = RuntimeHelper.downcallHandle(
        "sethostid",
        constants$14.sethostid$FUNC
    );
    static final FunctionDescriptor getdomainname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getdomainname$MH = RuntimeHelper.downcallHandle(
        "getdomainname",
        constants$14.getdomainname$FUNC
    );
    static final FunctionDescriptor setdomainname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle setdomainname$MH = RuntimeHelper.downcallHandle(
        "setdomainname",
        constants$14.setdomainname$FUNC
    );
    static final FunctionDescriptor vhangup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle vhangup$MH = RuntimeHelper.downcallHandle(
        "vhangup",
        constants$14.vhangup$FUNC
    );
}


