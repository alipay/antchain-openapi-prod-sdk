// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class BasicCarInfo extends TeaModel {
    // 车牌号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 车架号
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 发动机号
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("engine_no")
    @Validation(required = true)
    public String engineNo;

    // 初登日期
    /**
     * <strong>example:</strong>
     * <p>2021-12-21</p>
     */
    @NameInMap("register_date")
    @Validation(required = true)
    public String registerDate;

    // 车辆型号
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    // 营运性质
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("use_nature_code")
    @Validation(required = true)
    public String useNatureCode;

    // 是否抵押
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("mortgage")
    public Boolean mortgage;

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

    public BasicCarInfo setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public BasicCarInfo setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public BasicCarInfo setUseNatureCode(String useNatureCode) {
        this.useNatureCode = useNatureCode;
        return this;
    }
    public String getUseNatureCode() {
        return this.useNatureCode;
    }

    public BasicCarInfo setMortgage(Boolean mortgage) {
        this.mortgage = mortgage;
        return this;
    }
    public Boolean getMortgage() {
        return this.mortgage;
    }

}
