//Created by Ivan Marosevic
//
//
//



fun main(){
    fun isValjanOIB(oib: String): Boolean {
        if (oib == null || oib.length != 11) {
            return false
        }
        val chars = oib.toCharArray()
        var a = 10
        for (i in 0 until 10) {
            val c = chars[i]
            if (c < '0' || c > '9') {
                return false
            }
            a += (c - '0')
            a %= 10
            if (a == 0) {
                a = 10
            }
            a *= 2
            a %= 11
        }
        var kontrolni = 11 - a
        kontrolni %= 10
        return kontrolni == (chars[10] - '0')
    }
    
    println(isValjanOIB("67805710685")) //true
    println(isValjanOIB("05943632515")) //true
    println(isValjanOIB("05943632514")) //false
    }