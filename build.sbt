//
// http://spark.apache.org/docs/latest/quick-start.html#a-standalone-app-in-scala
//
name := "hello-spark"

// 2.11 doesn't seem to work
scalaVersion := "2.11.8"

//libraryDependencies ++= Dependencies.sparkHadoop

//releaseSettings

//scalariformSettings

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"

