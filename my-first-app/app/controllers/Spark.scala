package controllers

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

import org.elasticsearch.spark._

class Spark() extends App {
  
    def sparkCall( userId: Int ) : Int = {
      
      println("inside spark call: "+userId)
    
    	val appName="tm2"
    	val sparkMasterURL = "local[2]"
    	val conf = new SparkConf()
    			.setAppName(appName)
    			.setMaster(sparkMasterURL)
    			
      conf.set("es.index.auto.create", "true")
    	val sc = new SparkContext(conf)
    	
    	val RDD1 = sc.esRDD("lamscope_index_data/modulelogs")
    	RDD1.take(3).foreach(println)
    	
    	sc.stop()
    	return 99
   }
}