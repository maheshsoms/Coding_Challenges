package Stack

class StringReverse {

  def rev(str: String): String ={

    /**
      * str.toList is not optimized
      *
      */
    var data=str.toList
    var len=data.length-1
    var builds=""
    def doit(chr: List[Char]): String= {
      for(i <- len to 0 by -1 ) {
        builds =builds:+data(i)
      }
      println(builds)
      builds

    }
    doit(data)
  }
}


object sol extends App {
  var rev=new StringReverse()

  rev.rev("Mahesh")
}