package com.example.thuctap.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Accounts")
@SuppressWarnings("serial")
public class Account implements Serializable {
    @Id
    @Column(name = "Username")
    private String username;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Email")
    private String email;

    @Column(name = "NumberPhone")
    private String numberPhone;

    @Column(name = "Sex")
    private Boolean sex;

    @Column(name = "Birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Column(name = "Address")
    private String address;

    @Column(name = "Password")
    private String password;

    @Column(name = "Status")
    private Integer status;

    @JsonIgnore()
    @OneToMany(mappedBy = "account")
    List<Authority> authorities;

    @JsonIgnore()
    @OneToMany(mappedBy = "account")
    List<Order> orders;

    public String detailStatus() {
        if (this.status == 1) {
            return "Đang Hoạt Động";
        } else {
            return "Ngừng Hoạt Động";
        }
    }
}
