package org.dianahep.h2mumu.apps

// spark import
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.sql.Dataset

// spark-root import
import org.dianahep.sparkroot.experimental._

object ReductionApp {
  def main(args: Array[String]) {
    // simple syntax key=v1,v2,v3
    val options = args.tail.map(_.split('=')).map({case x => (x(0), x(1))}).toMap
    val files = options.get("files") match {
      case Some(x) => x.split(",")
      case None => throw new Exception("No Files were provided")
    }

    // top columns that are to be selected
    val requiredColumns = Seq(
      "patMuons_slimmedMuons__RECO_",
      "patElectrons_slimmedElectrons__RECO_",
      "patTaus_slimmedTaus__RECO_",
      "recoVertexs_offlineSlimmedPrimaryVertices__RECO_",
      "recoBeamSpot_offlineBeamSpot__RECO_",
      "edmTriggerResults_TriggerResults__HLT_",
      "patTriggerObjectStandAlones_selectedPatTrigger__RECO_",
      "patMETs_slimmedMETs__RECO_",
      "patJets_slimmedJets__RECO_"
    )

    // options for reading
    val roptions = Map(
      "tree" -> "Events"
    )

    // read in 
    val spark = SparkSession.builder()
      .appName("Higgs -> MuMu Reduction")
      .getOrCreate()
    spark.sparkContext.setLogLevel("WARN")
    val df = spark.sqlContext.read.options(roptions).root(files:_*)
    import spark.implicits._

    // count
    val numRows = df.count
    println(s"Total Number of Rows/Events: ${numRows}")

    // start


    // save as parquet
    val output = options.get("output") match {
      case Some(x) => x
      case None => "file:/tmp/tmpparquet"
    }
    //df.select(requiredColumns.head, requiredColumns.tail:_*).write.parquet(output)
  }
}
