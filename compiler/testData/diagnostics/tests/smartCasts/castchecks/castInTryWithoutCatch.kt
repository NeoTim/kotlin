fun castInTry(s: Any) {
    try {
        s as String // Potential cast exception
    } finally {
        s.<!UNRESOLVED_REFERENCE!>length<!>
    }
    s.<!UNRESOLVED_REFERENCE!>length<!>
}

fun castInTryAndFinally(s: Any) {
    try {
        s as String // Potential cast exception
    } finally {
        s as String // Potential cast exception
    }
    <!DEBUG_INFO_SMARTCAST!>s<!>.length
}
