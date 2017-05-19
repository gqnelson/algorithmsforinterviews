5/2
3/2

val x = Array(1, 2, 3, 4, 5)
x(0)
x.length/2
x(x.length/2)
x.drop(x.length/2 + 1)
x.dropRight(x.length/2 + 1)

x.drop(5).length


x.scanLeft(0)((acc, n) => math.max(0, acc + n)).max

Array(1,2,3,-4).scanLeft(0)((acc, n) => math.max(0, acc + n)).max

Array(-1,2,3,4).scanLeft(0)((acc, n) => math.max(0, acc + n)).max

Array(-2,-3,4,-1,-2,1,5,-3).scanLeft(0)((acc, n) => math.max(0, acc + n)).max

val y = Array(-1,-2,-3,-4)
y.tail.scanLeft(y.head)((acc, n) => math.max(0, acc + n)).max






