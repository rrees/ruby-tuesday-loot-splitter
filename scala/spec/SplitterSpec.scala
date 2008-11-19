import org.specs._
import splitter._
import gems._

object SplitterSpecification extends Specification {
	
	val splittableLoot = new GemBag(Array[Gem](new Gem(2), new Gem(5), new Gem(3), new Gem(3), new Gem(1), new Gem(4), new Gem(3)))
	
	val unsplittableLoot = new GemBag(Array(new Gem(7), new Gem(3)))
	
	"Splitter must take a GemBag with the loot to split and the number of people to split the loot between" in {
		LootSplitter.splitLoot(splittableLoot, 3)
	}
	
	"Splitter must return an empty list when it cannot split loot" in {
		LootSplitter.splitLoot(unsplittableLoot, 4).isEmpty mustBe true
	}
	
	"Splitter must return a list of shares if the loot can be split" in {
		LootSplitter.splitLoot(splittableLoot, 3).length mustBe 3
	}
}
