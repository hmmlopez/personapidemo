package nl.hlopez.blc.workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private Integer id;
    @QuerySqlField
    private String firstName;
    @QuerySqlField
    private String lastName;
    @QuerySqlField
    private int age;

}
