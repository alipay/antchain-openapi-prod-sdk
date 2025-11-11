// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DriverLicenseInfo extends TeaModel {
    // 性别，字典
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gender")
    public String gender;

    // 驾驶证发证日期,当前日期减去实际日期的天数所在区间
    /**
     * <strong>example:</strong>
     * <p>A/-A</p>
     */
    @NameInMap("issue_date")
    public String issueDate;

    // 驾驶证有效终止日期
    /**
     * <strong>example:</strong>
     * <p>A/-A</p>
     */
    @NameInMap("valid_end_date")
    public String validEndDate;

    // 驾驶证有效起始日期
    /**
     * <strong>example:</strong>
     * <p>A/-A</p>
     */
    @NameInMap("valid_start_date")
    public String validStartDate;

    // 驾驶证状态，字典
    /**
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("driver_license_status")
    public String driverLicenseStatus;

    // 初次领证时间
    /**
     * <strong>example:</strong>
     * <p>A/-A</p>
     */
    @NameInMap("first_issue_date")
    public String firstIssueDate;

    // 准驾车型，字典
    /**
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("allow_drive_car")
    public String allowDriveCar;

    // 驾驶证种类，字典
    /**
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("driver_license_type")
    public String driverLicenseType;

    public static DriverLicenseInfo build(java.util.Map<String, ?> map) throws Exception {
        DriverLicenseInfo self = new DriverLicenseInfo();
        return TeaModel.build(map, self);
    }

    public DriverLicenseInfo setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public DriverLicenseInfo setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public String getIssueDate() {
        return this.issueDate;
    }

    public DriverLicenseInfo setValidEndDate(String validEndDate) {
        this.validEndDate = validEndDate;
        return this;
    }
    public String getValidEndDate() {
        return this.validEndDate;
    }

    public DriverLicenseInfo setValidStartDate(String validStartDate) {
        this.validStartDate = validStartDate;
        return this;
    }
    public String getValidStartDate() {
        return this.validStartDate;
    }

    public DriverLicenseInfo setDriverLicenseStatus(String driverLicenseStatus) {
        this.driverLicenseStatus = driverLicenseStatus;
        return this;
    }
    public String getDriverLicenseStatus() {
        return this.driverLicenseStatus;
    }

    public DriverLicenseInfo setFirstIssueDate(String firstIssueDate) {
        this.firstIssueDate = firstIssueDate;
        return this;
    }
    public String getFirstIssueDate() {
        return this.firstIssueDate;
    }

    public DriverLicenseInfo setAllowDriveCar(String allowDriveCar) {
        this.allowDriveCar = allowDriveCar;
        return this;
    }
    public String getAllowDriveCar() {
        return this.allowDriveCar;
    }

    public DriverLicenseInfo setDriverLicenseType(String driverLicenseType) {
        this.driverLicenseType = driverLicenseType;
        return this;
    }
    public String getDriverLicenseType() {
        return this.driverLicenseType;
    }

}
