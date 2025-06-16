// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CarInfo extends TeaModel {
    // 车辆信息
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 车架号
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 发动机号
    @NameInMap("engine_no")
    @Validation(required = true)
    public String engineNo;

    // 
    // 注册日期
    @NameInMap("register_date")
    @Validation(required = true)
    public String registerDate;

    // 车型
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    public static CarInfo build(java.util.Map<String, ?> map) throws Exception {
        CarInfo self = new CarInfo();
        return TeaModel.build(map, self);
    }

    public CarInfo setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public CarInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public CarInfo setEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }
    public String getEngineNo() {
        return this.engineNo;
    }

    public CarInfo setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public CarInfo setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
