import Personne._
import scala.collection.immutable._
//import scala.collection.mutable._
object helloworld {
 val variable2 : String= ""


  def collectionSeq(): Unit={

    val maSeq : Seq[String] = Seq("luc", "pierre", "assane", "ella", "salomon", "hamed", "marietou")
    val seq_count : Seq[Int]= maSeq.map(e =>e.length)

    seq_count.foreach(i => println(i))

    // avec filter affiche les noms dont la taille est superieur a 3


    val sequance = maSeq.filter(_.length >3)
    sequance.foreach( f => println(f))

    val monMap : Map[String, String]= Map(
      "cc"->"cocody",
      "iy"-> "poy",
    "abi"->"abidjan"
    )
    monMap.keys.foreach(k =>k)

  }

  def main(args: Array[String]): Unit ={

    val texte : String = "Hello world, mon premier programme en scala"
    val texte2 : String = texte +variable2

    val test = println(texte)


    collectionSeq()


  }
 /*
  // structure de donnees
def maCollection(): Unit={
  val maliste = List("jvc", "hdy","ecole")

  //declaration d'une liste
  val maliste2 : List[Int]= List(1,3,4,5)

  //declarer et instancier

  val malist3 : List[String] = List("ato", "luc", "jean")

  //Utilisation des fonctions anonymes
*/


}

