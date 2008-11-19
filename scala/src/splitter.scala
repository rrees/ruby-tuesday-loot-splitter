import gems._

package splitter {
	
	class LootSplitter
		
	object LootSplitter {
		def splitLoot(gembag: GemBag, shares: Int): List[GemBag] = {
			
			if((gembag.totalValue % shares) != 0) {
				return List[GemBag]()
			}
			
			val partShares: List[GemBag] = List.make(shares, new GemBag(Array()))
			
			
			
			partShares
		}
	}
}