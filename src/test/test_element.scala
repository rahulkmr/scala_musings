import org.scalatest.Suite
import Element.elem

class ElementSuite extend Suite {
  def testUniformElement() {
    val el = elem('x', 2, 3)
    assert(el.width == 2)
  }
}
