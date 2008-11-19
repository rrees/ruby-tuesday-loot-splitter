
package gems {
	
	class Gem(aValue: Int) {
		def value: Int = aValue
	}

	class GemBag(gems: Array[Gem]) {
		
		def totalValue(): Int = {
			( 0 /: gems.map (_.value)) (_ + _)
		}
		
		def foreach(function: (Gem) => Unit): Unit = {
			gems.foreach(function)
		}
	}
}