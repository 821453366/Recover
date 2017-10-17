package com.eu.front.entity;
public class Recovery {
    private Integer id;
    private String recoveryYear;
    private String recoveryMonth;
    private String recoveryCode;//代码
    private String recoverySteelId;//名称
    private String recoveryCapacity;//大小
    private String recoveryPirce;//价格
    private String recovaryStorageId;
    public Recovery() {
        super();
    }
    public Recovery(Integer id,String recoveryYear,String recoveryMonth,String recoveryCode,String recoverySteelId,String recoveryCapacity,String recoveryPirce,String recovaryStorageId) {
        super();
        this.id = id;
        this.recoveryYear = recoveryYear;
        this.recoveryMonth = recoveryMonth;
        this.recoveryCode = recoveryCode;
        this.recoverySteelId = recoverySteelId;
        this.recoveryCapacity = recoveryCapacity;
        this.recoveryPirce = recoveryPirce;
        this.recovaryStorageId = recovaryStorageId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecoveryYear() {
        return this.recoveryYear;
    }

    public void setRecoveryYear(String recoveryYear) {
        this.recoveryYear = recoveryYear;
    }

    public String getRecoveryMonth() {
        return this.recoveryMonth;
    }

    public void setRecoveryMonth(String recoveryMonth) {
        this.recoveryMonth = recoveryMonth;
    }

    public String getRecoveryCode() {
        return this.recoveryCode;
    }

    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }

    public String getRecoverySteelId() {
        return this.recoverySteelId;
    }

    public void setRecoverySteelId(String recoverySteelId) {
        this.recoverySteelId = recoverySteelId;
    }

    public String getRecoveryCapacity() {
        return this.recoveryCapacity;
    }

    public void setRecoveryCapacity(String recoveryCapacity) {
        this.recoveryCapacity = recoveryCapacity;
    }

    public String getRecoveryPirce() {
        return this.recoveryPirce;
    }

    public void setRecoveryPirce(String recoveryPirce) {
        this.recoveryPirce = recoveryPirce;
    }

    public String getRecovaryStorageId() {
        return this.recovaryStorageId;
    }

    public void setRecovaryStorageId(String recovaryStorageId) {
        this.recovaryStorageId = recovaryStorageId;
    }

}
