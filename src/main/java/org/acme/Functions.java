package org.acme;
import io.quarkus.funqy.Funq;

import static io.vertx.codegen.CodeGenProcessor.log;

public class Functions {

    @Funq("TriggerUserResponse")
    public String fun(FunInput input) {
        log.info("Triggered function with input");
        return String.format("Hello %s!", input != null ? input.name : "Funqy Man Disco Chicken");

    }

    public static class FunInput {
        public String name;
        // constructors, getters, setters
    }
}