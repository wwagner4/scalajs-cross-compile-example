ThisBuild / scalaVersion := "2.13.13"
lazy val utestVersion = "0.8.2"
lazy val scalaJsJqueryVersion = "1.0.0"

lazy val root = project.in(file(".")).
  aggregate(foo.js, foo.jvm).
  settings(
    publish := {},
    publishLocal := {},
  )

lazy val foo = crossProject(JSPlatform, JVMPlatform).in(file(".")).
  settings(
    name := "foo",
    version := "0.1-SNAPSHOT",
    testFrameworks += new TestFramework("utest.runner.Framework"),

    scalacOptions ++= Seq(          // use ++= to add to existing options
      "-deprecation",
    )                               // for "trailing comma", the closing paren must be on the next line

  ).
  jvmSettings(
      libraryDependencies += "com.lihaoyi" %% "utest" % utestVersion % "test",
  ).
  jsSettings(
    libraryDependencies += "com.lihaoyi" %%% "utest" % utestVersion % "test",
    scalaJSUseMainModuleInitializer := true,
  )
