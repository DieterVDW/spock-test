import spock.lang.Specification

class SpockTest extends Specification {
    def setupSpec() {
      throw new IllegalArgumentException()
    }

    def theTest() {
        when:
        def x = 10

        then:
        x == 10
    }
}