def gcd(x: Long, y: Long) = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}
println(gcd(4096,64))
