package com.development.todo1.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@Access(AccessType.FIELD)
public class ProductEntity extends ParentEntity {
    private static final long serialVersionUID = 8435405591663518471L;

    @Id
    @Column(name = "CODE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer code;

    @Column(name="NAME")
    String name;

    @Column(name = "STATUS")
    boolean status;

    public ProductEntity(Integer code, String name, boolean status) {
        this.code = code;
        this.name = name;
        this.status = status;
    }

    public ProductEntity() {}

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

