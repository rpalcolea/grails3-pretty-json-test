package test
import grails.converters.*
class TestController {
    def index() {
      render(Person.list() as JSON)
    }
}
