import gems._

package splitter {
	
	class LootSplitter
		
	object LootSplitter {
		def splitLoot(gembag: GemBag, shares: Int): List[GemBag] = {
			
			if((gembag.totalValue % shares) != 0) {
				return List[GemBag]()
			}
			
			val individualShareValue = gembag.totalValue / shares
			
			var partShares: List[GemBag] = List.make(shares, new GemBag(List()))
			
			gembag.gems.sort(_.value > _.value).foreach((gem: Gem) => {
				assignGemToBag(gem, partShares)
				partShares = partShares.sort(_.totalValue < _.totalValue)
				partShares = List(partShares(0) add gem) ::: (partShares drop 1)
			})
			
			partShares
		}
		
		private def assignGemToBag(gem:Gem,  bags: List[GemBag]): List[GemBag] = {
			bags
		}
	}
}