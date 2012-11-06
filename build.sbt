organization := "com.weiglewilczek.slf4s"

name := "slf4s"

version := "1.0.7"

scalaVersion := "2.10.0-RC1"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.6.1"
)

publishTo <<= version { (v: String) =>
  val nexus = "http://mvn.compose.cc:8081/nexus/content/repositories"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("Blend Snapshots (publish)" at nexus + "/snapshots/")
  else
    Some("Blend Releases"  at nexus + "/releases/")
}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
