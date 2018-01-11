name := """my-first-app"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += "Local Maven Repository" at "file:///home/neil/.m2/repository"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "org.apache.spark" %% "spark-core" % "2.0.0",
  "org.apache.spark" %% "spark-sql" % "2.0.0",
  "org.apache.spark" %% "spark-streaming" % "2.1.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "2.2.0",
  "org.elasticsearch" %% "elasticsearch-spark-20" % "5.4.1"
)

libraryDependencies += filters