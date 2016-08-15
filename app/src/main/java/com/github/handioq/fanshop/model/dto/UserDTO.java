package com.github.handioq.fanshop.model.dto;

import com.google.gson.annotations.SerializedName;

public class UserDTO {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("amount_spent")
    private double amountSpent;

    @SerializedName("email")
    private String email;

    @SerializedName("telephone")
    private String telephone;

    @SerializedName("address")
    private AddressDTO address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountSpent=" + amountSpent +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address=" + address +
                '}';
    }
}
