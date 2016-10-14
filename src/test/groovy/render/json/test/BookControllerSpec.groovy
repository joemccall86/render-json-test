package render.json.test

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(BookController)
class BookControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "json renders properly"() {
        when: 'method is called'
        controller.renderJson()

        then: 'response is correct'
        response.status == 200
        response.json != [:]
    }
}
