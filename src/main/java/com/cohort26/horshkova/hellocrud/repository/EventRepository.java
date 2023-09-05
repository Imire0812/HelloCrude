package com.cohort26.horshkova.hellocrud.repository;

import com.cohort26.horshkova.hellocrud.domain.Event;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EventRepository {
    static List<Event> events = new ArrayList<>(Arrays.asList(
            new Event("Opera", "London", 50.0),
            new Event("Violin concert", "Prague", 35.0),
            new Event("Jazz concert", "Berlin", 20.0),
            new Event("Art exhibition", "London", 60.5),
            new Event("Royal Variety Show", "Paris", 65.0)
    ));

    public List<Event> findAll() {
        return events;
    }

    public void save(Event event) {
        events.add(event);
    }

    public void save(int id, Event event) {
        Event updEvent = events.get(id);
        updEvent.setName(event.getName());
        updEvent.setCity(event.getCity());
        updEvent.setPrice(event.getPrice());
    }

    public Event findById(int id) {
        return events.get(id);
    }

    public void remove(int id) {
        events.remove(id);
    }
}