fun foo(a: Boolean, b: Boolean): Int {
    val x: Int
    if (a) {
        x = 1
    }
    when (b) {
        true -> <!VAL_REASSIGNMENT!>x<!> = 2
        false -> <!VAL_REASSIGNMENT!>x<!> = 3
    }
    return x
}

fun bar(a: Boolean, b: Boolean): Int {
    val x: Int
    if (a) {
        x = 1
    }
    when (b) {
        false -> <!VAL_REASSIGNMENT!>x<!> = 3
    }
    return <!UNINITIALIZED_VARIABLE!>x<!>
}