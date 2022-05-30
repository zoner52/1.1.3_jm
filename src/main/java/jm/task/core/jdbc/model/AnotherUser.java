package jm.task.core.jdbc.model;

public class AnotherUser {

    private long id;

    private String name;
    private int age;


    public AnotherUser(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


}
