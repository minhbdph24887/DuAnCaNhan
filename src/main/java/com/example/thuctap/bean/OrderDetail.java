package com.example.thuctap.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "OrderDetail")
@SuppressWarnings("serial")
public class OrderDetail implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOderDetail;

    @ManyToOne()
    @JoinColumn(name = "OrderID")
    private Order order;

    @ManyToOne()
    @JoinColumn(name = "ProductDetailID")
    private ProductDetail productDetail;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "Price")
    private BigDecimal price;
}
