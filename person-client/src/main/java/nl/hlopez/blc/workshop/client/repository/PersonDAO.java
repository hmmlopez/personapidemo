package nl.hlopez.blc.workshop.client.repository;

import nl.hlopez.blc.workshop.model.Person;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteAtomicSequence;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.cache.query.ScanQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.cache.Cache;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDAO {

    private static final Logger log = LoggerFactory.getLogger(PersonDAO.class);

    @Autowired
    private Ignite ignite;

    private IgniteCache<Integer, Person> cache;
    private IgniteAtomicSequence sequence;

    @PostConstruct
    public void init() {
        //TODO: 1. Get an instance of the cache
        //TODO: 2. Initialize the sequence with initVal to 1
    }

    public List<Person> getAll() {
        List<Person> persons = new ArrayList<>();
        List<Cache.Entry<Object, Object>> all = cache.query(new ScanQuery<>()).getAll();
        all.forEach(entry -> {
            Integer key = (Integer) entry.getKey();
            Person person = (Person) entry.getValue();
            person.setId(key);
            persons.add(person);
        });
        return persons;
    }

    public Person save(Person person) {
        log.info(">>> Saving: " + person + " in the cache.");
        //TODO: 3. Put the person in the cache, using the sequence (and the Math.toIntExcact method)
        //TODO:    NOTE: If the person.id is null generate a new Id with the sequence and put it in the cache
        return person;
    }
}
