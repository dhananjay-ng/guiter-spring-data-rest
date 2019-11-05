package com.guitar.model.projections;

import com.guitar.model.Manufacturer;
import com.guitar.model.Model;
import com.guitar.model.ModelType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(name = "modelView", types = {Model.class})
public interface ModelView {

    @Value("#{target.name}")
    String getModelName();

    void setName(String name);

    BigDecimal getPrice();

    int getFrets();

    String getWoodType();

    @Value("#{target.manufacturer.name}")
    String getManufacturerName();

    ModelType getModelType();
}
