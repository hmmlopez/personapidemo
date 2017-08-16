package nl.hlopez.blc.workshop.client;

import nl.hlopez.blc.workshop.client.repository.PersonDAO;
import nl.hlopez.blc.workshop.model.Person;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class ClientApplication {
    private static Logger log = LoggerFactory.getLogger(ClientApplication.class);

    public static void main(String[] args) {

        try (ConfigurableApplicationContext ctx = SpringApplication.run(ClientApplication.class, args)) {
            // -------------------
            //TODO: START SECTION 1 (PUT AND GET)
            // -------------------
            //TODO:  1. Get an instance of ignite from the context
            //TODO:  2. Use the ignite instance to get the cache "PERSON_CACHE" from the server (IgniteCache<Integer, Person>)
            //TODO:  3. Create a new Person and put that in the cache
            //TODO:  4. Log the user just inserted in the cache
            //TODO:  5. Do a check first if the key already exists in the cache then log that person, other wise do put
            // -------------------
            //TODO: END SECTION 1
            //TODO: Restart the server(s) to clear the cache, then continue with step 6
            // -------------------
            //TODO: START SECTION 2 (USING DAO)
            // -------------------
            //TODO:  6. Get an instance of the DAO
            //TODO:  7. Use the DAO to insert a new Person in the cache
            //TODO:  8. Use the DAO to get all persons from the cache and log them in console
            // -------------------
            //TODO: END SECTION 2
            // -------------------
            //TODO: START SECTION 3 (REST API)
            // -------------------
            //TODO:  9. Follow the comments in the PersonController class to make the Rest API working

        }
    }
}
