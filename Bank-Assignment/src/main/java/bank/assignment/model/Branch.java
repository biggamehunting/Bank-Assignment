package bank.assignment.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Branch implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String type;
    private String cifNo;
    private String accountNo;
    private String address;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String region;
    private String head;
    @Column(nullable = false, updatable = false)
    private String BranchCode;

    public Branch() {}

    public Branch(String name, String email, String jobTitle, String phone, String imageUrl, String BranchCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.BranchCode = BranchCode;
    }

    public Branch(String name, String email, String type, String jobTitle, String phone, String imageUrl, String branchCode) {
        this.name = name;
        this.email = email;
        this.type = type;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        BranchCode = branchCode;
    }

    public Branch(String name, String email, String type, String cifNo, String accountNo, String address, String jobTitle, String phone, String imageUrl, String branchCode) {
        this.name = name;
        this.email = email;
        this.type = type;
        this.cifNo = cifNo;
        this.accountNo = accountNo;
        this.address = address;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        BranchCode = branchCode;
    }

    public Branch(String name, String email, String type, String cifNo, String accountNo, String address, String jobTitle, String phone, String imageUrl, String region, String head, String branchCode) {
        this.name = name;
        this.email = email;
        this.type = type;
        this.cifNo = cifNo;
        this.accountNo = accountNo;
        this.address = address;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.region = region;
        this.head = head;
        BranchCode = branchCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCifNo() {
        return cifNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", cifNo='" + cifNo + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", address='" + address + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", region='" + region + '\'' +
                ", head='" + head + '\'' +
                ", BranchCode='" + BranchCode + '\'' +
                '}';
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String BranchCode) {
        this.BranchCode = BranchCode;
    }

}
