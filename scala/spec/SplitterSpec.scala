import org.specs._
import splitter._
import gems._

object SplitterSpecification extends Specification {
	
	val splittableLoot = new GemBag(Array[Gem](new Gem(2), new Gem(5), new Gem(3), new Gem(3), new Gem(1), new Gem(4), new Gem(3)))
	
	"Splitter must take a GemBag with the loot to split" in {
		LootSplitter.splitLoot(splittableLoot)
	}
	"Splitter must return an empty list when it cannot split loot" in {}
}
