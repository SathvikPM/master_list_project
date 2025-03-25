package com.tap.project1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "master_list")
public class MasterList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String parentCode;
    private String parentName;
    private String name;
    private String plan;
    private String option;
    private String optionFrequency;
    private Boolean transactionModeAllowed;
    private String subCategory;
    private String sector;
    private Integer benchmark;
    private Integer faceValue;

    public MasterList() {}

    public MasterList(Long id, String parentCode, String parentName, String name, String plan, String option, 
                      String optionFrequency, Boolean transactionModeAllowed, String subCategory, 
                      String sector, Integer benchmark, Integer faceValue) {
        this.id = id;
        this.parentCode = parentCode;
        this.parentName = parentName;
        this.name = name;
        this.plan = plan;
        this.option = option;
        this.optionFrequency = optionFrequency;
        this.transactionModeAllowed = transactionModeAllowed;
        this.subCategory = subCategory;
        this.sector = sector;
        this.benchmark = benchmark;
        this.faceValue = faceValue;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getOptionFrequency() {
        return optionFrequency;
    }

    public void setOptionFrequency(String optionFrequency) {
        this.optionFrequency = optionFrequency;
    }

    public Boolean getTransactionModeAllowed() {
        return transactionModeAllowed;
    }

    public void setTransactionModeAllowed(Boolean transactionModeAllowed) {
        this.transactionModeAllowed = transactionModeAllowed;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(Integer benchmark) {
        this.benchmark = benchmark;
    }

    public Integer getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Integer faceValue) {
        this.faceValue = faceValue;
    }
}
