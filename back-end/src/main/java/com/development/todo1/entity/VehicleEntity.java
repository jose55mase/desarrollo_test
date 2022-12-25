package com.development.todo1.entity;

import com.development.todo1.util.Message;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Properties;

@Data
@Builder
@RestController()
@Entity
@Table(name = "VEHICLE")
@Access(AccessType.FIELD)
public class VehicleEntity extends ParentEntity {
    private static final long serialVersionUID = 8435405591663518471L;

    Properties propiedades = new Properties();


    @Id
    @Column(name = "CODE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String code;

    @OneToOne()
    @JoinColumn(name = "CODE")
    ProductEntity productType;

    //@NotBlank(message = "El campo es requerido.")
    @Column(name = "PRODUCT_CAOUT")
    String productCaunt;

    //@NotBlank(message = "El campo es requerido.")
    @Column(name = "REGISTER_DATE")
    String registerDate;

    //@NotBlank(message = "El campo es requerido.")
    @Column(name="DELIVERY_DATE")
    String deliveryDate;

    //@NotBlank(message = "El campo es requerido.")
    @Column(name="DELIVERY_STORE")
    String deliveryStore;

    //@NotBlank(message = "El campo es requerido.")
    @Column(name="DELIVERY_PRICE")
    String deliveryPrice;

    //@NotBlank(message = "El campo es requerido.")
    @Column(name = "LIECENSEPLETE")
    String licenseplete;

    //@NotBlank(message = "El campo es requerido.")
    @Column(name = "GUIDE_NUMBER")
    String guideNumber;

    public VehicleEntity(Properties propiedades, String code, ProductEntity productType, String productCaunt, String registerDate, String deliveryDate, String deliveryStore, String deliveryPrice, String licenseplete, String guideNumber) {
        this.propiedades = propiedades;
        this.code = code;
        this.productType = productType;
        this.productCaunt = productCaunt;
        this.registerDate = registerDate;
        this.deliveryDate = deliveryDate;
        this.deliveryStore = deliveryStore;
        this.deliveryPrice = deliveryPrice;
        this.licenseplete = licenseplete;
        this.guideNumber = guideNumber;
    }

    public VehicleEntity() {

    }
}
