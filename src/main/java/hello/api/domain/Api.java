package hello.api.domain;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Api {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    private float latitude;  //위도
    private float longitude; //경도
    private int speed;  //속도

    private LocalDateTime time; //시간

}
