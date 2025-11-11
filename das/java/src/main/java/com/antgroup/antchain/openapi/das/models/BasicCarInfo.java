// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class BasicCarInfo extends TeaModel {
    // 号牌号码
    /**
     * <strong>example:</strong>
     * <p>京Axxxxx</p>
     */
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 号牌种类，枚举值
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("license_type")
    @Validation(required = true)
    public String licenseType;

    // 车架号
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 发动机号
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("engine_no")
    @Validation(required = true)
    public String engineNo;

    public static BasicCarInfo build(java.util.Map<String, ?> map) throws Exception {
        BasicCarInfo self = new BasicCarInfo();
        return TeaModel.build(map, self);
    }

    public BasicCarInfo setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public BasicCarInfo setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public BasicCarInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public BasicCarInfo setEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }
    public String getEngineNo() {
        return this.engineNo;
    }

}
