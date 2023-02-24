// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DetailCarInfo extends TeaModel {
    // 号牌号码
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 号牌种类，枚举值
    // 
    @NameInMap("license_type")
    @Validation(required = true)
    public String licenseType;

    // 车架号
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 发动机号
    @NameInMap("engine_no")
    @Validation(required = true)
    public String engineNo;

    // 初登日期
    @NameInMap("register_date")
    @Validation(required = true)
    public String registerDate;

    // 车辆型号
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    // 是否营运车辆，枚举值
    @NameInMap("use_nature_code")
    @Validation(required = true)
    public String useNatureCode;

    // 能源种类，枚举值
    @NameInMap("fuel_type")
    @Validation(required = true)
    public String fuelType;

    // 排量，数字
    @NameInMap("displacement")
    @Validation(required = true)
    public String displacement;

    public static DetailCarInfo build(java.util.Map<String, ?> map) throws Exception {
        DetailCarInfo self = new DetailCarInfo();
        return TeaModel.build(map, self);
    }

    public DetailCarInfo setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public DetailCarInfo setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public DetailCarInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public DetailCarInfo setEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }
    public String getEngineNo() {
        return this.engineNo;
    }

    public DetailCarInfo setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public DetailCarInfo setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public DetailCarInfo setUseNatureCode(String useNatureCode) {
        this.useNatureCode = useNatureCode;
        return this;
    }
    public String getUseNatureCode() {
        return this.useNatureCode;
    }

    public DetailCarInfo setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }
    public String getFuelType() {
        return this.fuelType;
    }

    public DetailCarInfo setDisplacement(String displacement) {
        this.displacement = displacement;
        return this;
    }
    public String getDisplacement() {
        return this.displacement;
    }

}
