package nl.hlopez.blc.workshop.model;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    private Person person;

    @BeforeMethod
    public void setUp() throws Exception {
        person = new Person(1, "Justin", "Bieper", 26);
    }

    @Test
    public void testNoArgConstructor() {
        person = null;
        person = new Person();
        assertNotNull(person);
    }

    @Test
    public void testAllArgConstructor() {
        person = null;
        person = new Person(2, "Peter", "Pan", 16);
        assertNotNull(person);
        assertEquals(person.getId(), new Integer(2));
        assertEquals(person.getFirstName(), "Peter");
        assertEquals(person.getLastName(), "Pan");
        assertEquals(person.getAge(), 16);
    }

    @Test
    public void testGetId() {
        assertEquals(person.getId(), new Integer(1));
    }

    @Test
    public void testGetFirstName() throws Exception {
        assertEquals(person.getFirstName(), "Justin");
    }

    @Test
    public void testGetLastName() throws Exception {
        assertEquals(person.getLastName(), "Bieper");
    }

    @Test
    public void testGetAge() throws Exception {
        assertEquals(person.getAge(), 26);
    }

    @Test
    public void testSetId() {
        Integer value = 15;
        person.setId(value);
        assertEquals(person.getId(), value);
    }

    @Test
    public void testSetFirstName() throws Exception {
        String firstName = "Jose";
        person.setFirstName(firstName);
        assertEquals(person.getFirstName(), firstName);
    }

    @Test
    public void testSetLastName() throws Exception {
        String lastName = "Zonneveld";
        person.setLastName(lastName);
        assertEquals(person.getLastName(), lastName);
    }

    @Test
    public void testSetAge() throws Exception {
        int age = 21;
        person.setAge(age);
        assertEquals(person.getAge(), age);
    }

}