package sample

import spock.lang.Specification

class SampleFormatterSpec extends Specification {

    def 'Creating a greeting'() {

        expect: 'The greeeting to be correctly capitalized'
        SampleFormatter.greet('gradlephant') == 'Hello, Gradlephant'

    }
}