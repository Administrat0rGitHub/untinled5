



import kotlin.math.pow

fun main() {
    println("Введите целое число n:")
    val n = readlnOrNull()?.toIntOrNull()
    println("Введите  степень x:")
    val x = readlnOrNull()?.toIntOrNull()
    if (n == null || x == null || x <= 1) {
        println("Ошибка!: Введите корректные значения для n и x (x > 1).")
        return
    }
    var a = 0
    var dgr = 1
    while (dgr < n) {
        a++
        dgr = x.toDouble().pow(a.toDouble()).toInt()
    }
    if (dgr == n) {
        println("Существует целочисленный показатель степени: y = $a")
    } else {
        println("Целочисленный показатель не существует.")
    }
}