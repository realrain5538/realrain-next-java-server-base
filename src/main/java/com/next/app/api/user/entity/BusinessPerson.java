package com.next.app.api.user.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "businessPerson_realrain")
public class BusinessPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String businessNumber;

    @Column
    private String companyName;

    @Column
    private String representativeName;

    @Column
    private String contactEmail;

    @Column
    private String contactPhone;

    @Column
    private String address;

    @Column
    private LocalDate registeredAt;

    @PrePersist
    protected void onRegister(){
        registeredAt = java.time.LocalDate.now();
    }

    public BusinessPerson() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BusinessPerson(
            Long id,
            String businessNumber,
            String companyName,
            String representativeName,
            String contactEmail,
            String contactPhone,
            String address,
            LocalDate registeredAt
    ){
        this.id = id;
        this.businessNumber = businessNumber;
        this.companyName = companyName;
        this.representativeName = representativeName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.address = address;
        this.registeredAt = registeredAt;
    }

}
