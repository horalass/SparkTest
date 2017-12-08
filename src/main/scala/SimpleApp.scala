import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.sql._


object SimpleApp {
  def main(args: Array[String]) {
    val spark = SparkSession
      .builder()
      .master("local[*]")
      .appName("Spark SQL basic example")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()
    val customer = spark.read
      .option("header","true")
      .option("inferSchema","true")
      .option("delimiter", ";")
      .csv("D:\\projet\\data\\customer.csv")
    //customer.show()
    val state = spark.read
      .option("header","false")
      .option("inferSchema","true")
      .option("delimiter", ";")
      .csv("D:\\projet\\data\\state.csv")
    //state.show()
    state.join(customer, customer("idState") === state("_c0")).show()

  }
}
