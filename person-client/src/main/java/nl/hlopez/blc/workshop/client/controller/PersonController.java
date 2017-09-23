package nl.hlopez.blc.workshop.client.controller;

import nl.hlopez.blc.workshop.client.repository.PersonDAO;
import nl.hlopez.blc.workshop.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
public class PersonController {
    //TODO: 1. Enable spring-boot-starter-web in the pom.xml
    //TODO: 2. Uncomment all commented code (inclusive imports)

    @Autowired
    private PersonDAO personDAO;

    //@GetMapping(path = "/person")
    public List<Person> getAllPersons() {
        //TODO: 3. Use the DAO to get all persons
        return null;
    }
    //TODO: 4. View all data through the browser

    //@PostMapping(path = "/person")
    public Person save(           Person person) {
        //TODO: 5. Use the DAO to save a person (add @RequestBody to the method parameter)
        return null;
    }
    //TODO: 6. Use Postman to get all data and post data
}
