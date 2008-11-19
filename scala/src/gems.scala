
package gems {
	
	class Gem(aValue: Int) {
		def value: Int = aValue
	}

	class GemBag(gems: Array[Gem]) {
		
		def totalValue(): Int = {
			val gemValues = gems.map (_.value)
			( 0 /: gemValues) (_ + _)
		}
	}
}