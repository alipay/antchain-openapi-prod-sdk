// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CarInfo extends TeaModel {
    // 车牌号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 车架号
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 发动机号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("engine_no")
    @Validation(required = true)
    public String engineNo;

    // 
    // 注册日期
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("register_date")
    @Validation(required = true)
    public String registerDate;

    // 车型
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
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
