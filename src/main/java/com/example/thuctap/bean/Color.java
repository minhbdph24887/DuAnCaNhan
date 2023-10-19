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
@Table(name = "Colors")
@SuppressWarnings("serial")
public class Color implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColor;

    @Column(name = "CodeColor")
    private String codeColor;

    @Column(name = "Status")
    private Integer status;

    @JsonIgnore()
    @OneToMany(mappedBy = "color")
    List<ProductDetail> productDetails;

    public String getStatusColor() {
        if (this.status == 1) {
            return "Đang Hoạt Động";
        } else {
            return "Ngừng Hoạt Động";
        }
    }
}
