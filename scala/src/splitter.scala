import gems._

package splitter {
	
	class LootSplitter
		
	object LootSplitter {
		
		val emptyBag = List[GemBag]()

		val smallestGemBagFirst = {(firstGemBag: GemBag, secondGemBag: GemBag) => firstGemBag.totalValue < secondGemBag.totalValue}

		val largestGemFirst = {(aGem: Gem, anotherGem: Gem) => aGem.value > anotherGem.value}
		
		def splitLoot(gembag: GemBag, shares: Int): List[GemBag] = {
			
			
			if((gembag.totalValue % shares) != 0) {
				return emptyBag
			}
			
			val individualShareValue = gembag.totalValue / shares
			
			var partShares: List[GemBag] = List.make(shares, new GemBag(List()))
			
			gembag.gems.sort(largestGemFirst).foreach((gem: Gem) => {
				partShares = assignGemToBag(gem, partShares)
			})
			
			partShares
		}
		
		private def assignGemToBag(gem:Gem,  bags: List[GemBag]): List[GemBag] = {
			val sortedBags = bags.sort(smallestGemBagFirst)
			List(sortedBags(0) add gem) ::: (sortedBags drop 1)
		}
	}
}