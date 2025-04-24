// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BasicCarInfo extends TeaModel {
    // 车牌号码
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

    // 初登日期
    @NameInMap("register_date")
    @Validation(required = true)
    public String registerDate;

    // 车辆型号
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    // 营运性质
    @NameInMap("use_nature_code")
    @Validation(required = true)
    public String useNatureCode;

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

}
