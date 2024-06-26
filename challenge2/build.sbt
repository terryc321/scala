

ThisBuild / scalaVersion := "3.4.2"

lazy val hello = project
  .in(file("."))
  .settings(
    name := "firstclass"
  )

