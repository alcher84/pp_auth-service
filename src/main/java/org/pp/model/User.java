package org.pp.model;

import lombok.*;

import javax.persistence.*;

@ToString(includeFieldNames = true)
@EqualsAndHashCode(of = {"userName"}, callSuper = false)
@Getter
@Setter
@Entity
@Builder
@Table(name = "users")
public class User extends AuditableObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    private String userName;
    private String userPassword;
    private String firstName;
    private String secondName;
    private String email;
    private Integer userRoleId;
    private boolean isVerified;
    private boolean isArchived;
}
