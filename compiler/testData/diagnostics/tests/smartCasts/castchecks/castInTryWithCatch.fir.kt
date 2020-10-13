fun castInTry(s: Any) {
    try {
        s as String // Potential cast exception
    } catch (e: Exception) {
        s.length
    } finally {
        s.length
    }
    s.length
}

fun castInTryAndCatch(s: Any) {
    try {
        s as String // Potential cast exception
    } catch (e: Exception) {
        s as String // Potential cast exception
    } finally {
        s.length
    }
    s.length
}

fun castAtAll(s: Any) {
    try {
        s as String // Potential cast exception
    } catch (e: Exception) {
        s as String // Potential cast exception
    } finally {
        s as String // Potential cast exception
    }
    s.length
}
