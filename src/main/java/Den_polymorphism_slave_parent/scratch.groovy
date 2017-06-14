import groovy.json.JsonOutput

class Parent {

    private String x = "parent string"

    @Override
    String toString() {
        return JsonOutput.prettyPrint(JsonOutput.toJson(x))
        return getX().getClass().getName()
    }

    Parent getX() {}
}


class Slave extends Parent {

    public String x
    public String y

    Slave () {
        x = "slave test";
        y = "Some text";
    }

    Parent getX() {
        return this
    }
}

Parent testSlave = new Slave()

println testSlave

