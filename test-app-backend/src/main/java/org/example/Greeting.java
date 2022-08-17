package org.example;

public class Greeting {

    private final long id;

    private final String content;

    private final  String name;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    private final String address;



    public Greeting(long id, String content, String name, String address) {
        this.id = id;
        this.content = content;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
