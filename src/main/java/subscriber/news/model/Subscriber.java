package subscriber.news.model;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class Subscriber {
    private Integer id;
    private String email;

    public Subscriber(Integer id,String email){
        this.id = id;
        this.email = email;
    }

}
