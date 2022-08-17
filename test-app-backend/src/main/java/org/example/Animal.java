package org.example;

/**
 * @author wjf
 */
public class Animal {
    public long id;

    public Animal(long incrementAndGet, String format, String name, String address) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String name;
    public  String age;

    public Animal(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
