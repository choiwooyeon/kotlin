
// 반환값이 있는 경우
fun sum(a: Int, b: Int=10) = a+b

//반환값이 없는 경우
fun main(args: Array<String>) {
    println(sum(1))
    println(sum(1,2))
}