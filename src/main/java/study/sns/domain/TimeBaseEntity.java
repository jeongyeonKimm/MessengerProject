package study.sns.domain;

import lombok.Getter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class TimeBaseEntity {

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
