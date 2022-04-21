package Event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j

public class Event extends ApplicationEvent {

    private final String data;

    public Event(String data) {
        super(data);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}


