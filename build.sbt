  
name := "TaxiEventGenerator"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  // config
  "com.typesafe" % "config" % "1.2.1", 
)

conflictManager := ConflictManager.latestRevision

mainClass := Some("EventGenerator.TaxiEventDataGenerator")
//mainClass := Some("sparkhelloworld.SparkProcessGameRDD")

// assemblyMergeStrategy in assembly := {
//   case PathList("META-INF", xs @ _*) => MergeStrategy.discard
//   case x => MergeStrategy.first
// }