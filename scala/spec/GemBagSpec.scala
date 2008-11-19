import org.specs._
import gems._

object GemSpec extends Specification {
	"Gem must take a value" in {
		new Gem(5)
	}
	
	"Gem must have a value" in {
		new Gem(5).value mustBe 5
	}
}

object GemBagSpec extends Specification {

	val exampleGemBag = new GemBag(Array(new Gem(3), new Gem(4)))

	"GemBag must take a list of integers" in {
		new GemBag(Array(new Gem(1), new Gem(2), new Gem(3), new Gem(4)))
	}
	
	"GemBag must have a total value" in {
		exampleGemBag.totalValue mustBe 7
	}
}