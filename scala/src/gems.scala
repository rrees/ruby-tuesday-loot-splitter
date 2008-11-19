
package gems {
	
	class Gem(aValue: Int) {
		def value: Int = aValue
	}

	class GemBag(someGems: List[Gem]) {
		
		def add(aGem: Gem) : GemBag = {
			new GemBag(someGems ::: List(aGem))
		}
		
		def totalValue(): Int = {
			( 0 /: someGems.map (_.value)) (_ + _)
		}
		
		def foreach(function: (Gem) => Unit): Unit = {
			someGems.foreach(function)
		}
		
		def gems() : List[Gem] = {
			someGems
		}
	}
}