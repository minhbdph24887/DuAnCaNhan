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
@Table(name = "Categories")
@SuppressWarnings("serial")
public class Category implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;

    @Column(name = "Name")
    private String nameCategory;

    @Column(name = "Status")
    private Integer status;

    @JsonIgnore()
    @OneToMany(mappedBy = "category")
    List<ProductDetail> productDetails;

    public String getStatusCategory() {
        if (this.status == 1) {
            return "Đang Hoạt Động";
        } else {
            return "Ngừng Hoạt Động";
        }
    }
}
