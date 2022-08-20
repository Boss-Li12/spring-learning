package com.fat.pojo;

/**
 * @author fatsea
 * @date 2022/8/15 - 21:40
 */
public class Address {


    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
