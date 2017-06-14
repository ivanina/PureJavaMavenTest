package Den_polymorphism_slave_parent;


public class App {
    public static void main(String[] args) {
        Parent slave = new Slave();
        Parent parent = new Parent();

        System.out.println("This is slave: "+slave.toString());
        System.out.println("This is parent: "+parent.toString());
    }
}
