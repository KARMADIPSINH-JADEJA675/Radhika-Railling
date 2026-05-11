package sem6.radhikarailing.entity;

import jakarta.persistence.*;

@Entity
public class OrderData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String mobile;

    private String address;

    private String productName;

    private Double totalPrice;

    private Double width;

    private Double height;

    private String pipeGrade;

    private String pipeSize;

    // GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getPipeGrade() {
        return pipeGrade;
    }

    public void setPipeGrade(String pipeGrade) {
        this.pipeGrade = pipeGrade;
    }

    public String getPipeSize() {
        return pipeSize;
    }

    public void setPipeSize(String pipeSize) {
        this.pipeSize = pipeSize;
    }
}