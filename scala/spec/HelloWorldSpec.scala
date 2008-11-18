import org.specs._

object HelloWorld extends Specification {

	"'Hello world' has 11 characters" in {
		"Hello world".size mustEqual 11
	}
}