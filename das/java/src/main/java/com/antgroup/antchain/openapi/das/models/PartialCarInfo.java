// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class PartialCarInfo extends TeaModel {
    // 车牌号码
    /**
     * <strong>example:</strong>
     * <p>京Axxxxx</p>
     */
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 车架号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
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

    public static PartialCarInfo build(java.util.Map<String, ?> map) throws Exception {
        PartialCarInfo self = new PartialCarInfo();
        return TeaModel.build(map, self);
    }

    public PartialCarInfo setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public PartialCarInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public PartialCarInfo setEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }
    public String getEngineNo() {
        return this.engineNo;
    }

    public PartialCarInfo setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public PartialCarInfo setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public PartialCarInfo setUseNatureCode(String useNatureCode) {
        this.useNatureCode = useNatureCode;
        return this;
    }
    public String getUseNatureCode() {
        return this.useNatureCode;
    }

}
