name := "bug"

scalaVersion := "2.13.1"

lazy val hello = (project in file("."))
  .settings(
    addCompilerPlugin("org.scalameta" % "semanticdb-scalac_2.13.1" % "4.3.0"),
    addCompilerPlugin("com.github.ghik" % "silencer-plugin_2.13.1" % "1.4.4")
  )
