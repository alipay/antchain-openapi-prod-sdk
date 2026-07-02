// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceTripProperties extends TeaModel {
    // 上报时间
    /**
     * <strong>example:</strong>
     * <p>1765794345159</p>
     */
    @NameInMap("report_time")
    @Validation(required = true)
    public String reportTime;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("power_status")
    @Validation(required = true)
    public String powerStatus;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("endurance_mileage")
    @Validation(required = true)
    public String enduranceMileage;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_mileage")
    @Validation(required = true)
    public String totalMileage;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("speed")
    @Validation(required = true)
    public String speed;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("coord")
    @Validation(required = true)
    public String coord;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("location")
    @Validation(required = true)
    public String location;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rein")
    @Validation(required = true)
    public String rein;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("spd_bd")
    @Validation(required = true)
    public String spdBd;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cs")
    @Validation(required = true)
    public String cs;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("eqst")
    @Validation(required = true)
    public String eqst;

    public static DeviceTripProperties build(java.util.Map<String, ?> map) throws Exception {
        DeviceTripProperties self = new DeviceTripProperties();
        return TeaModel.build(map, self);
    }

    public DeviceTripProperties setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public String getReportTime() {
        return this.reportTime;
    }

    public DeviceTripProperties setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
        return this;
    }
    public String getPowerStatus() {
        return this.powerStatus;
    }

    public DeviceTripProperties setEnduranceMileage(String enduranceMileage) {
        this.enduranceMileage = enduranceMileage;
        return this;
    }
    public String getEnduranceMileage() {
        return this.enduranceMileage;
    }

    public DeviceTripProperties setTotalMileage(String totalMileage) {
        this.totalMileage = totalMileage;
        return this;
    }
    public String getTotalMileage() {
        return this.totalMileage;
    }

    public DeviceTripProperties setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

    public DeviceTripProperties setCoord(String coord) {
        this.coord = coord;
        return this;
    }
    public String getCoord() {
        return this.coord;
    }

    public DeviceTripProperties setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DeviceTripProperties setRein(String rein) {
        this.rein = rein;
        return this;
    }
    public String getRein() {
        return this.rein;
    }

    public DeviceTripProperties setSpdBd(String spdBd) {
        this.spdBd = spdBd;
        return this;
    }
    public String getSpdBd() {
        return this.spdBd;
    }

    public DeviceTripProperties setCs(String cs) {
        this.cs = cs;
        return this;
    }
    public String getCs() {
        return this.cs;
    }

    public DeviceTripProperties setEqst(String eqst) {
        this.eqst = eqst;
        return this;
    }
    public String getEqst() {
        return this.eqst;
    }

}
