package com.guitar.model.projections;

import com.guitar.model.Manufacturer;
import com.guitar.model.Model;
import com.guitar.model.ModelType;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(name = "modelDetail", types = {Model.class})
public interface ModelDetail {
    String getName();

    void setName(String name);

    BigDecimal getPrice();

    int getFrets();

    String getWoodType();

    Manufacturer getManufacturer();

    ModelType getModelType();

}
