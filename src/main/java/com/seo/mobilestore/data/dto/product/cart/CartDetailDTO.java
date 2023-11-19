package com.seo.mobilestore.data.dto.product.cart;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.seo.mobilestore.data.dto.product.ProductOrderDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDetailDTO {
    @JsonIgnore
    private long id;
    private CartDTO cartDTO;
    private int size;
    List<ProductOrderDTO> orderProductDTOList;
}