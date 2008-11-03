
require File.join(File.dirname(__FILE__), 'spec_helper.rb')

require 'Ruby'

describe Ruby do

	it "should have a value" do
		ruby = Ruby.new(:value => 62, :test => "Robert")
		ruby.value.should be 62
	end

end

