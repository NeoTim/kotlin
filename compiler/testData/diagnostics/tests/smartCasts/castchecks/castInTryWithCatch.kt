fun castInTry(s: Any) {
    try {
        s as String // Potential cast exception
    } catch (e: Exception) {
        s.<!UNRESOLVED_REFERENCE!>length<!>
    } finally {
        s.<!UNRESOLVED_REFERENCE!>length<!>
    }
    s.<!UNRESOLVED_REFERENCE!>length<!>
}

fun castInTryAndCatch(s: Any) {
    try {
        s as String // Potential cast exception
    } catch (e: Exception) {
        s as String // Potential cast exception
    } finally {
        s.<!UNRESOLVED_REFERENCE!>length<!>
    }
    s.<!UNRESOLVED_REFERENCE!>length<!>
}

fun castAtAll(s: Any) {
    try {
        s as String // Potential cast exception
    } catch (e: Exception) {
        s as String // Potential cast exception
    } finally {
        s as String // Potential cast exception
    }
    <!DEBUG_INFO_SMARTCAST!>s<!>.length
}
