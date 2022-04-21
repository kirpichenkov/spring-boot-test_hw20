package Event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class EventPub implements ApplicationContextAware {
    private ApplicationContext context;
    public void publisherEvent(String event) {
        context.publishEvent(new Event(event));
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}