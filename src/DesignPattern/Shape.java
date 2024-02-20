package DesignPattern;

public abstract class Shape implements Cloneable {
    String id;
    String type;
    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() throws CloneNotSupportedException {
        Object cloneObject=null;
        cloneObject=super.clone();
        return cloneObject;
    }
}
