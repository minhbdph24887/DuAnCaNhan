package com.example.thuctap.repository;

import com.example.thuctap.bean.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
    @Query(value = "select * from ProductDetails where Status= 1", nativeQuery = true)
    List<ProductDetail> cbbProductDetails();

    @Modifying
    @Transactional
    @Query(value = "update ProductDetails set Status= 0 where ID= :idProductDetail", nativeQuery = true)
    void deleteProductDetail(@Param("idProductDetail") Long idProductDetail);
}
