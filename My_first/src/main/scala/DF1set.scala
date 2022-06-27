import org.apache.spark.sql.SparkSession

object DF1set {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .appName("andre")
      .config("spark.master", "local")
      .getOrCreate()

    val DF_1 = spark.read
      .format("json")
      .option("InferSchema", "true")
      .load("src/main/recursos/data/cars.json")

    DF_1.show(5)

  }
}
