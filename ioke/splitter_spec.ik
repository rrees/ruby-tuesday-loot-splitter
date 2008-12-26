use ("ispec")

Gem = Origin mimic

describe(Gem,
	it("should have a value",
		gem = Gem mimic
		gem value = 12
		(gem value) should == 12)
)