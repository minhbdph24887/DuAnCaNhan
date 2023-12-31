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
@Table(name = "Sizes")
@SuppressWarnings("serial")
public class Size implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSize;

    @Column(name = "Name")
    private String nameSize;

    @Column(name = "Status")
    private Integer status;

    @JsonIgnore()
    @OneToMany(mappedBy = "size")
    List<ProductDetail> productDetails;

    public String getStatusSize() {
        if (this.status == 1) {
            return "Đang Hoạt Động";
        } else {
            return "Ngừng Hoạt Động";
        }
    }
}
