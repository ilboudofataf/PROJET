import scala.collection.immutable._
//import scala.collection.mutable._
object collectionsequence {

  def main(args: Array[String]): Unit ={
    collectionSeq()

  }

  def collectionSeq(): Unit={

    val maSeq : Seq[String] = Seq("luc", "pierre", "assane", "ella", "salomon", "hamed", "marietou")

    val seq_count : Seq[Int]= maSeq.map(e =>e.length)

    seq_count.foreach(i => println(i))
  }



}
