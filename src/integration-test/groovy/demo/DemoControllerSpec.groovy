package demo

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class DemoControllerSpec extends GebSpec {
    void 'test controller action which uses dynamic method'() {
        when:
        go '/demo/add?x=4&y=7'

        then:
        $().text() == '4 plus 7 is 11.'
    }
}
