organization := "io.dtk"

name := "ignite-query"

version := "0.1"

scalaVersion := "2.10.5"

libraryDependencies += "org.apache.ignite" % "ignite-core" % "1.4.1"
libraryDependencies += "org.apache.ignite" % "ignite-indexing" % "1.4.1"


resolvers  ++= Seq(
  "Ignite repos" at "http://www.gridgainsystems.com/nexus/content/repositories/external",
  Resolver.mavenLocal
)

