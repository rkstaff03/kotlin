// WITH_RUNTIME
// IS_APPLICABLE: false
fun foo(list: List<Any>): String? {
    <caret>for (o in list) {
        if (bar(o as String)) {
            return o
        }
    }
    return null
}

fun bar(s: String): Boolean = true