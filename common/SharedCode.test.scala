//> using dep "org.scalameta::munit::1.0.0-M7"

//> using file "SharedCode.scala"

class SharedCodeTests extends munit.FunSuite {
  test(s"renderText adds a footer and a header") {
    val result = renderText("sample")
    assertEquals(result.split("\n").length, 5)
  }
}
