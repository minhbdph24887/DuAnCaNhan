package com.example.thuctap.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "PromotionsProduct")
@SuppressWarnings("serial")
public class PromotionsProduct implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotionsProduct;

    @ManyToOne()
    @JoinColumn(name = "PromotionsID")
    private Promotion promotion;

    @ManyToOne()
    @JoinColumn(name = "ProductDetailID")
    private ProductDetail productDetail;

    @Column(name = "Status")
    private Integer status;

    public String getStatusPromotionsProduct() {
        if (this.status == 1) {
            return "Đang Hoạt Động";
        } else {
            return "Ngừng Hoạt Động";
        }
    }
}
