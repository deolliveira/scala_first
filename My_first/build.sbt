ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.10"



lazy val root = (project in file("."))
  .settings(
    name := "My_first"

  )

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-sql" % "3.0.0",
  "org.apache.spark" %% "spark-core" % "3.0.0"
)

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.2.12" % Test
)
libraryDependencies ++= sparkDependencies ++ testDependencies


