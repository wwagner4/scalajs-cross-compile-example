# Scala.js cross compile example

This is an example on how to cross compile code to Scala.js and Scala JVM.

To try it out, launch sbt and type:

    sbt> compile
    sbt> test
    sbt> publishLocal     <- Necessary to run the showcases
    sbt> showcaseJS/run
    sbt> showcaseJVM/run

More information can be found in the
[Scala.js documentation](https://www.scala-js.org/doc/project/cross-build.html) and in the [sbt-crossproject](https://github.com/portable-scala/sbt-crossproject) plugin documentation.
