organization := "com.weiglewilczek.slf4s"

name := "slf4s"

version := "1.0.7"

scalaVersion := "2.10.0-RC1"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.6.1"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some("Blend Repository" at "https://blend.artifactoryonline.com/blend/blend")
