package Den_polymorphism_slave_parent;

class Parent extends GodParent {
    private String x = "parent string X";

    @Override
    Parent getThis() {
        return this;
    }
}
