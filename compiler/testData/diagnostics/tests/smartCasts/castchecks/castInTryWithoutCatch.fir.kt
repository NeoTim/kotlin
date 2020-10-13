fun castInTry(s: Any) {
    try {
        s as String // Potential cast exception
    } finally {
        s.length
    }
    s.length
}

fun castInTryAndFinally(s: Any) {
    try {
        s as String // Potential cast exception
    } finally {
        s as String // Potential cast exception
    }
    s.length
}
