package com.davidconneely.bluemixreg2015;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

/**
 * This JAX-RS configuration could be added to the Question2 class but then running Question2 as a standalone console
 * application would require that the class javax.ws.rs.core.Application was present in the user class path.
 * By keeping it separate we make it easier to run Question2 from a command prompt / shell as well as a JAX-RS resource.
 */
@ApplicationPath("/")
public final class Application2 extends Application {
    private static final Set<Object> RESOURCES = Collections.singleton(new Question2());

    @Override
    public Set<Object> getSingletons() {
        return RESOURCES;
    }
}
