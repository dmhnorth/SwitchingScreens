package dmhnorth.switchingscreens.app;

import java.io.Serializable;

/**
 * Created by Dave on 28/07/2014.
 */
public class Person implements Serializable {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
