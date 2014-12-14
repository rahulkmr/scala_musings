class CheckSum {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xff) + 1
}

val acc = new CheckSum
acc add 1
acc add 3
acc add 9
acc add 15
println(acc.checksum)
