package ch.erard22.azure.sample;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class GreetingEntity extends PanacheEntity {

    public String name;

}
