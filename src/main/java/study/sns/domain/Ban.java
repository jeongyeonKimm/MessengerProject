package study.sns.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ban extends TimeBaseEntity {

    @Id @GeneratedValue
    @Column(name = "ban_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "create_id")
    private Profile create;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "target_id")
    private Profile target;

}
