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

	val exampleGemBag = new GemBag(Array(new Gem(3), new Gem(4), new Gem(6)))

	"GemBag must take a list of integers" in {
		new GemBag(Array(new Gem(1), new Gem(2), new Gem(3), new Gem(4)))
	}
	
	"GemBag must have a total value" in {
		exampleGemBag.totalValue mustBe 13
	}
	
	"Gem Bag should have a list of gems" in {
		val gemValues = exampleGemBag gems() map((gem: Gem) => gem.value)
		
		gemValues.length mustBe 3
		
		List(3, 4, 6).foreach((x: Int) => gemValues must contain(x))
	}
	
	"Gem Bag should accept more gems" in {
		var gemBag = new GemBag(Array(new Gem(7)))
		gemBag = gemBag.add(new Gem(13))
		
		gemBag.totalValue mustBe 20
	}
		
}