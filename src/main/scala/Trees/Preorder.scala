package Trees

sealed  trait BTREE[+A]

case object LEAF extends BTREE[Nothing]

case class BRANCH[A] (v: A,l: BTREE[A],r: BTREE[A]) extends BTREE[A]


class Preorder {

  def build(tree: List[Int]): BTREE[Int] =tree match {
    case Nil => LEAF
    case x::xs => {
      val left=xs.filter(y=>(y<x))
      val right=xs.filter(y=>(y>x))
      BRANCH(x,build(left),build(right))
    }
  }
}

object main extends App {
   var sol=new Preorder
  val ls=List(5,2,3,1,7)
  println(sol.build(ls))
}

