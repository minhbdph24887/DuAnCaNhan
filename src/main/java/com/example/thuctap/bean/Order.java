package com.example.thuctap.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Orders")
@SuppressWarnings("serial")
public class Order implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    @ManyToOne()
    @JoinColumn(name = "Username")
    private Account account;

    @Column(name = "CreateDate")
    private Date createDate = new Date();

    @Column(name = "Address")
    private String address;

    @Column(name = "TotalAmount")
    private BigDecimal totalAmount;

    @Column(name = "Note")
    private String note;

    @Column(name = "Status")
    private Integer status;

    @JsonIgnore()
    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;
}
