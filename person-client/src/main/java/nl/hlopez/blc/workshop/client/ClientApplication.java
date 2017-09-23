package nl.hlopez.blc.workshop.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClientApplication {
    private static Logger log = LoggerFactory.getLogger(ClientApplication.class);

    public static void main(String[] args) {

        try (ConfigurableApplicationContext ctx = SpringApplication.run(ClientApplication.class, args)) {
            // -------------------
            //TODO: START SECTION 1 (PUT AND GET)
            //TODO: Make sure the server(s) are running, and completed the steps there.
            // -------------------
            //TODO:  1. Get an instance of ignite from the context
            //TODO:  2. Use the ignite instance to get the cache "PERSON_CACHE" from the server (IgniteCache<Integer, Person>)
            //TODO:  3. Create a new Person object with id = 0
            //TODO:  4. Log the user that will be inserted in the cache
            //TODO:  5. Do a put if the person is absent in the cache, if absent log " inserted in cache", if present log " already in cache"
            //TODO:     Use the method putIfAbsent which will give true if the person was added successfully
            //TODO:  6. Run the client program and check the logs to see if the user was inserted in the cache
            //TODO:  7. Run the client one more time to confirm that the user already exist in the cache
            // -------------------
            //TODO: END SECTION 1
            //TODO: Restart the server(s) to clear the cache, then continue with SECTION 2
            // -------------------
            //TODO: START SECTION 2 (USING DAO)
            // -------------------
            //TODO:  8. Follow the comments in the PersonDAO to finish the coding
            //TODO:  9. Get an instance of the DAO
            //TODO: 10. Use the DAO to insert one or several new Person(s) in the cache
            //TODO: 11. Use the DAO to get all Person(s) from the cache and log them in console
            //TODO: 12. Run the client program and confirm cache data
            // -------------------
            //TODO: END SECTION 2
            //TODO: Restart the server(s) to clear the cache, then continue with SECTION 3
            // -------------------
            //TODO: START SECTION 3 (REST API)
            // -------------------
            //TODO: 13. Follow the comments in the PersonController class to make the Rest API working
            //TODO: 14. Remove the try-catch block to keep the client running so you can view it through the browser (http://localhost:8080/person)
            log.info(">>> Shutting down client application...");
        }
    }
}
