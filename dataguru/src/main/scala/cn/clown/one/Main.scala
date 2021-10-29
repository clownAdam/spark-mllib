package cn.clown.one

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

/**
 *
 * @author clown
 */
object Main {
  def main(args: Array[String]): Unit = {
    val session: SparkSession = SparkSession.builder().appName("Main").master("local[*]").getOrCreate()
    val sc: SparkContext = session.sparkContext
    val data: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val discData: RDD[Int] = sc.parallelize(data, 3)
    val ints: Array[Int] = discData.take(3)
    for (elem <- ints) {
      println(elem)
    }
    discData.collect().foreach(println)
  }
}
