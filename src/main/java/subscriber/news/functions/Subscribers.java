package subscriber.news.functions;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import subscriber.news.model.Subscriber;
import subscriber.news.service.SubscriberService;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class Subscribers {
    private final SubscriberService subscribers;

    public Subscribers(SubscriberService subscribers){
        this.subscribers = subscribers;

    }


    //supplier a prebuilt function equivalent to GET method
    @Bean
    public Supplier<List<Subscriber>> findAll() {
        return () -> subscribers.findAll();

    }

    // eq to POST

    @Bean
    public Consumer<String> create() {
        return (email) -> subscribers.create(email);
    }


}
