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
public class Manage extends TimeBaseEntity {

    @Id @GeneratedValue
    @Column(name = "manage_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "chatting_id")
    private Chatting chatting;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Enumerated(EnumType.STRING)
    private Status status;
    private Boolean bookmark;
}
