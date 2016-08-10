import test.Person
class BootStrap {

    def init = { servletContext ->
      100.times {
        new Person(name: 'Roberto').save()
      }
    }
    def destroy = {
    }
}
