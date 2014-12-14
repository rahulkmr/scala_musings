def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

def max2(x: Int, y: Int) = if (x > y) x else y

val greet = new Array[String](3)
greet(0) = "Hello"
greet(1) = ", "
greet(2) = "world!\n"
for (i <- 0 to 2)
  print(greet(i))
