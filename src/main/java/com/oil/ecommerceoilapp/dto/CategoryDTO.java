package com.oil.ecommerceoilapp.dto;

import com.oil.ecommerceoilapp.entity.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.awt.*;

@Getter
@Setter
public class CategoryDTO {

    private Integer id;
    private String categoryName;

    private String imageURL;

    private Product product;

    private Boolean enabled;

}
