package sample

import groovy.transform.CompileStatic

@CompileStatic
class SampleFormatter {
    static String greet(final String name) {
        "Hello, ${name.capitalize()}"
    }
}