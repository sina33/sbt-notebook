//import com.typesafe.sbt.packager.debian.Keys._
import sbt.Keys.name
import sbt.Keys.version
import scala._
import scala.Some

import com.typesafe.sbt.SbtStartScript
import scala.Some
import AssemblyKeys._ // put this at the top of the file

seq(SbtStartScript.startScriptForClassesSettings: _*)

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

name := "nb-app"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.4"

scalacOptions += "-optimize"

scalaVersion in Test := "2.10.4"

organization := "com.quoter"

packageArchetype.java_application

//packageDescription in Debian := "Describe Package"
//
//maintainer in Debian := "Sina33"
//
Revolver.settings



assemblySettings

test in assembly := {}

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.0.4"
  , "commons-lang" % "commons-lang" % "2.6"
  , "org.scala-lang" % "scala-library" % "2.10.4"
  , "org.scala-lang" % "scala-compiler" % "2.10.4"
  , "org.scala-lang" % "jline" % "2.10.4"
  , "junit" % "junit" % "4.11"
)

resolvers ++= Seq(
  "RoundEights" at "http://maven.spikemark.net/roundeights"
)

//Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5009 -Djava.library.path=\"src\\main\\resources\";"

javaOptions in testOnly += "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5009 -Djava.library.path=\"src\\main\\resources\";"

javaOptions in console += "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5009 -Djava.library.path=\"src\\main\\resources\";"

javaOptions in run += "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5009 -Djava.library.path=\"src\\main\\resources\";"

publishArtifact in packageSrc := false
