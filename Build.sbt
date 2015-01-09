import sbt.Keys.name
import sbt.Keys.version
import spray.revolver.RevolverPlugin.Revolver._
import scala._
import scala.Some

import com.typesafe.sbt.SbtStartScript
import scala.Some
import AssemblyKeys._
//import xerial.sbt.Pack._

jarName in assembly := "nb.jar"

assemblySettings

exportJars := true

//autoScalaLibrary := false

//packAutoSettings

//packSetting

//packMain := Map("nb" -> "com.quoter.notebook.App")

mainClass in assembly := Some("com.quoter.notebook.App")

//proguardSettings
//
//ProguardKeys.options in Proguard ++= Seq("-dontnote", "-dontwarn", "-ignorewarnings")
//
//ProguardKeys.options in Proguard += ProguardOptions.keepMain("com.quoter.notebook.App")

name := "nb-app"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.4"

scalacOptions += "-optimize"

scalaVersion in Test := "2.10.4"

organization := "com.quoter"

packageArchetype.java_application

//settings := defaultSettings

assemblySettings

test in assembly := {}

libraryDependencies ++= Seq(
//  "org.scalaz" %% "scalaz-core" % "7.0.4"
    "commons-lang" % "commons-lang" % "2.6"
  , "org.scala-lang" % "scala-library" % "2.10.4"
//  , "org.scala-lang" % "scala-compiler" % "2.10.4"
//  , "org.scala-lang" % "jline" % "2.10.4"
//  , "junit" % "junit" % "4.11"
)
