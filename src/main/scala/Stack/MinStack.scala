package Stack

import scala.collection.mutable

/**
  * this is a scala verion  of this java code https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/
  */

class MinStack {

  var s = new mutable.Stack[Int]

  var minEle: Int = _

  def MinStack() {
    this.s = new mutable.Stack[Int]
  }

  def getMin(): Unit = {
    if (s.isEmpty)
      println("the stack is empty")
    else
      println("the minimum element is:" + minEle)
  }

  def peek(): Unit = {
    if (s.isEmpty) {
      println("stack is empty")
      return
    }
    var t: Integer = s.top

    println("the top element is:" + t)

    if (t < minEle) {
      println(minEle)
    } else {
      println(t)
    }
  }

    def pop(): Unit = {
      if (s.isEmpty) {
        println("Stack is empty")
      }
      println("top most element removed")
      var t: Integer = s.pop()

      if(t < minEle) {
        println(minEle)
        minEle=2*minEle-t
      } else
        println(t)
    }

  def push(x: Int): Unit = {
    if(s.isEmpty){
      minEle=x
      s.push(x)
      println("item inserted "+x)
      return
    }
    if(x < minEle){
      s.push(2*x-minEle)
      minEle=x
    }
    else
      s.push(x)
    println("item inserted:"+x)
  }

}

object main extends App {

  var stack =new MinStack()

  stack.push(3)
  stack.push(5)
  stack.getMin()
  stack.push(2)
  stack.push(1)
  stack.getMin()
  stack.pop()
  stack.getMin()
  stack.pop()
  stack.peek()
}
