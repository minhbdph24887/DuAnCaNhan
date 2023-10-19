package com.example.thuctap.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "ProductDetails")
@SuppressWarnings("serial")
public class ProductDetail implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProductDetail;

    @ManyToOne()
    @JoinColumn(name = "ProductID")
    private Product product;

    @ManyToOne()
    @JoinColumn(name = "ColorID")
    private Color color;

    @ManyToOne()
    @JoinColumn(name = "SizeID")
    private Size size;

    @ManyToOne()
    @JoinColumn(name = "ProducerID")
    private Producer producer;

    @ManyToOne()
    @JoinColumn(name = "CategoryID")
    private Category category;

    @Column(name = "Images")
    private String images;

    @Column(name = "AvaiableQuantity")
    private Integer quantity;

    @Column(name = "PurchasePrice")
    private BigDecimal purchasePrice;

    @Column(name = "CostPrice")
    private BigDecimal costPrice;

    @Column(name = "Status")
    private Integer status;

    @JsonIgnore
    @OneToMany(mappedBy = "productDetail")
    List<PromotionsProduct> promotionsProducts;

    @JsonIgnore
    @OneToMany(mappedBy = "productDetail")
    List<OrderDetail> orderDetails;

    public String getStatusProductDetail() {
        if (this.status == 1) {
            return "Đang Còn Hàng";
        } else {
            return "Tạm Thời Hết Hàng";
        }
    }
}
