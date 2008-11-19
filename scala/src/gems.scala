
package gems {
	
	class Gem(aValue: Int) {
		def value: Int = aValue
	}

	class GemBag(gems: Array[Gem]) {}
}