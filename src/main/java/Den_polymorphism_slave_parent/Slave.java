package Den_polymorphism_slave_parent;



public class Slave extends Parent  {
    private String x = "slave X";
    private String y = "slave Y";
    private String z = "slave Z";

    @Override
    public Parent getThis(){
        return this;
    }
}
