package org.pp.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditableObject {

    @CreatedDate
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    protected ZonedDateTime createdDate;
    @LastModifiedDate
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    protected ZonedDateTime modifiedDate;
}
