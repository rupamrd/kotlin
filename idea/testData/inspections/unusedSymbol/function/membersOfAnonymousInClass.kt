class Klass {
    private val localObject = object {
        fun f() {
        }

        @Suppress("UnusedSymbol")
        fun fNoWarn() {}

        val p = 5
    }

    init {
        localObject.f()
        localObject.p
    }


    private fun localObject2() = object {
        fun f() {
        }

        @Suppress("UnusedSymbol")
        fun fNoWarn() {}

        val p = 5
    }

    fun localObject3() = @Suppress("UnusedSymbol") object {
        fun fNoWarn() {}
    }

    @Suppress("UnusedSymbol")
    private val localObject4 = object {
        fun fNoWarn() {}
    }

    init {
        localObject2().f()
        localObject2().p
    }


    private val a = object {
        val b = object {
            val c = object {
                val d = 5
            }
        }
    }

    init {
        a.b.c.d
    }
}

fun main(args: Array<String>) {
    Klass().localObject3()
}