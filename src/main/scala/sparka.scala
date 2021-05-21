import org.apache.spark.sql._
import org.apache.spark._

object sparka {

  def sessionSpark(): Unit={

    System.setProperty("winutils", "C:\\Hadoop\\bin")

    val ss = SparkSession.builder()
      .master( master = "local[*]") // le nom du noeud master.( son adresse ip du cluster)
      .appName( name = "Ma premiere application") //le nom de l'application
      //.enableHiveSupport()
      .getOrCreate()

    //Creation d'un RDD

    val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application Spark. Je suis un etudiant de l'INPHB heureux!"))

    rdd1.foreach(l => println(l))

    //dataframe sous spark (nous sommes entrain d'importer un fichier csv a une feuille)
    val df_1 = ss.read
      .format(source = "csv")
      .option("inferSchema", "true")
      .option("header", "true")
      .option("delimiter", ";")
      .csv( path= "C:\\Users\\HP\\Desktop\\M1_SEMESTRE2\\HADOOP\\Nouveau dossier (2)")

    df_1.show(numRows = 10) //Voir les 10 premieres lignes du csv
    df_1.printSchema()

    // SQL sous spark sans hive
    df_1.createOrReplaceTempView(viewName = "orders") // juste pour ma session
    //df_1.createGlobalTempView()   //rend le metastore de spark disponible sur plusieurs sessions
    // pour lancer le sql, on fait

    ss.sql(sqlText = "SELECT * FROM orders WHERE city = 'NEWTON'").explain()
    // .explain() permet de voir comment l'optimisateur de spark execute la requete SQL

  }
  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
}
