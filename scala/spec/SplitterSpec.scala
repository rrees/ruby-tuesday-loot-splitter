import org.specs._
import splitter._
import gems._

object SplitterSpecification extends Specification {
	
	val splittableLoot = new GemBag(List[Gem](new Gem(2), new Gem(5), new Gem(3), new Gem(3), new Gem(1), new Gem(4), new Gem(3)))
	
	val unsplittableLoot = new GemBag(List(new Gem(7), new Gem(3)))
	
	"Splitter must take a GemBag with the loot to split and the number of people to split the loot between" in {
		LootSplitter.splitLoot(splittableLoot, 3)
	}
	
	"Splitter must return an empty list when it cannot split loot" in {
		LootSplitter.splitLoot(unsplittableLoot, 4).isEmpty mustBe true
	}
	
	"Splitter must return a list of shares if the loot can be split" in {
		LootSplitter.splitLoot(splittableLoot, 3).length mustBe 3
	}
	
	"Shares returned for splittable loot should be equal" in {
		val shares = LootSplitter.splitLoot(splittableLoot,3)
		val firstShareValue = shares(0).totalValue
		
		shares.foreach((share: GemBag) => share.totalValue mustBe firstShareValue) 
	}
	
	"Share value must be as expected" in {
		LootSplitter.splitLoot(splittableLoot, 3)(0).totalValue mustBe 7
	}
	
}

object RubyQuizSpecification extends Specification {
	
	// 9 12 14 17 23 32 34 40 42 49
	val rubyQuizLoot = new GemBag(List(
		new Gem(9),
		new Gem(12),
		new Gem(14),
		new Gem(17),
		new Gem(23),
		new Gem(32),
		new Gem(34),
		new Gem(40),
		new Gem(42),
		new Gem(49)
		))

	"Should split the loot specified in Ruby Quiz #65" in {
		val shares = LootSplitter.splitLoot(rubyQuizLoot,  2)
		shares.length mustBe 2
		//shares.foreach((gemBag: GemBag) => gemBag.totalValue mustBe 136)
	}
}