// WITH_RUNTIME
// IS_APPLICABLE: false
fun foo(list: List<Any>, target: MutableCollection<String>) {
    <caret>for (o in list) {
        if (bar(o as String)) {
            target.add(o)
        }
    }
}

fun bar(s: String): Boolean = true