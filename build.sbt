ThisBuild / scalaVersion := "2.13.13"
lazy val utestVersion = "0.8.2"
lazy val scalaJsJqueryVersion = "1.0.0"
lazy val fooVersion = "0.1-SNAPSHOT"

lazy val root = project.in(file(".")).
  aggregate(
    foo.js, 
    foo.jvm,
  ).
  settings(
    name := "foo",
    organization := "example",
    version := fooVersion, 
  )

lazy val foo = crossProject(JSPlatform, JVMPlatform).in(file("core")).
  settings(
    name := "foo",
    organization := "example",
    version := fooVersion, 
    testFrameworks += new TestFramework("utest.runner.Framework"),
    scalacOptions ++= Seq(
      // "-deprecation",
    )                     

  ).
  jvmSettings(
    libraryDependencies += "com.lihaoyi" %% "utest" % utestVersion % "test",
  ).
  jsSettings(
    libraryDependencies += "com.lihaoyi" %%% "utest" % utestVersion % "test",
  )

lazy val showcase = crossProject(JSPlatform, JVMPlatform).in(file("showcase")).
  settings(
    name := "foo-showcase",
    organization := "example",
    version := fooVersion,
  ).
  jvmSettings(
    libraryDependencies += "example" %% "foo" % fooVersion,
  ).
  jsSettings(
    libraryDependencies += "example" %%% "foo" % fooVersion,
    scalaJSUseMainModuleInitializer := true,
  )
