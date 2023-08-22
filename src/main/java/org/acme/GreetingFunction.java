package org.acme;

import io.quarkus.funqy.Funq;

public class GreetingFunction {
    public static class Friend {
        String name;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public static class Greeting {
        String msg;

        public Greeting() {}
        public Greeting(String msg) { this.msg = msg;}

        public String getMessage() { return msg; }
        public void setMessage(String msg) { this.msg = msg; }
    }

    @Funq
    public Greeting greet(Friend friend) {
        return new Greeting("Hello " + friend.getName());
    }
}
