private val header = "### scala-cli startup time is fast"
private val footer = "### scala-cli allows packing the app into a binary"

def renderText(body: String): String = {
  s"""
$header

$body

$footer
  """.trim
}
