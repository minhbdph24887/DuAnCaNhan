package com.example.thuctap.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Products")
@SuppressWarnings("serial")
public class Product implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "Name")
    private String nameProduct;

    @Column(name = "Status")
    private Integer status;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<ProductDetail> productDetails;

    public String getStatusProduct() {
        if (this.status == 1) {
            return "Đang Hoạt Động";
        } else {
            return "Ngừng Hoạt Động";
        }
    }
}
