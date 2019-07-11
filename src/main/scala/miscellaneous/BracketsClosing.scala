package miscellaneous

class BracketsClosing {

  /** *
    * Code from a SO Soltuion
    *
    * give an string find if that string has proper close () brackets opening and closing
    *
    * ex provide a string "((())))" it should evaluate the closing and opening and return true/false
    */


  def matching(ls: String): Boolean = {
    val data=ls.toList
    def doit(chr: List[Char],level: Int): Boolean =chr match {
      case Nil => level==0
      case ')':: _ if(level <=1) =>false
      case '(':: xs => doit(xs,level+1)
      case ')'::xs => doit(xs,level-1)
    }

    doit(data,0)
  }

}
