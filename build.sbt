name := """charcoal-sword"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "jquery" % "3.1.1-1",
  "org.webjars" % "d3js" % "4.2.1",
  "org.webjars.npm" % "d3-geo" % "1.4.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)
