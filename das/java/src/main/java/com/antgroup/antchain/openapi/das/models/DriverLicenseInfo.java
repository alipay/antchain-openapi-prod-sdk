// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DriverLicenseInfo extends TeaModel {
    // 性别
    @NameInMap("gender")
    public String gender;

    // 驾驶证发证日期
    @NameInMap("driveissuedate")
    public String driveissuedate;

    // 驾驶证有效终止日期，当前日期减去实际日期的天数所在区间
    @NameInMap("validdate")
    public String validdate;

    // 驾驶证有效起始日期
    @NameInMap("drivevalidstartdate")
    public String drivevalidstartdate;

    // 驾驶证状态字典
    @NameInMap("drivecardstatus")
    public String drivecardstatus;

    // 初次领证时间
    @NameInMap("firsissuedate")
    public String firsissuedate;

    // 准驾车型，字典
    @NameInMap("allowdrivecar")
    public String allowdrivecar;

    // 驾驶证种类，字典
    @NameInMap("drivelicensetype")
    public String drivelicensetype;

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

    public DriverLicenseInfo setDriveissuedate(String driveissuedate) {
        this.driveissuedate = driveissuedate;
        return this;
    }
    public String getDriveissuedate() {
        return this.driveissuedate;
    }

    public DriverLicenseInfo setValiddate(String validdate) {
        this.validdate = validdate;
        return this;
    }
    public String getValiddate() {
        return this.validdate;
    }

    public DriverLicenseInfo setDrivevalidstartdate(String drivevalidstartdate) {
        this.drivevalidstartdate = drivevalidstartdate;
        return this;
    }
    public String getDrivevalidstartdate() {
        return this.drivevalidstartdate;
    }

    public DriverLicenseInfo setDrivecardstatus(String drivecardstatus) {
        this.drivecardstatus = drivecardstatus;
        return this;
    }
    public String getDrivecardstatus() {
        return this.drivecardstatus;
    }

    public DriverLicenseInfo setFirsissuedate(String firsissuedate) {
        this.firsissuedate = firsissuedate;
        return this;
    }
    public String getFirsissuedate() {
        return this.firsissuedate;
    }

    public DriverLicenseInfo setAllowdrivecar(String allowdrivecar) {
        this.allowdrivecar = allowdrivecar;
        return this;
    }
    public String getAllowdrivecar() {
        return this.allowdrivecar;
    }

    public DriverLicenseInfo setDrivelicensetype(String drivelicensetype) {
        this.drivelicensetype = drivelicensetype;
        return this;
    }
    public String getDrivelicensetype() {
        return this.drivelicensetype;
    }

}
