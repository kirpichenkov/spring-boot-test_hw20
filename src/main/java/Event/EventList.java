package Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class EventList implements ApplicationListener<Event> {
    private static final Logger log = LoggerFactory.getLogger(EventList.class);
    @Override
    public void onApplicationEvent(Event event) {
        log.info(event.getData());
    }
}

//public class EventList implements ApplicationListener<Event> {
//    @Override
//    public void onApplicationEvent(Event event) {
//        log.info(event.getData());
//    }
//}
