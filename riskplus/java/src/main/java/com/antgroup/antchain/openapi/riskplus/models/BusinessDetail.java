// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BusinessDetail extends TeaModel {
    // 经营地址
    @NameInMap("operating_addr_json")
    @Validation(required = true)
    public String operatingAddrJson;

    // 社会统一信用代码
    @NameInMap("uc_code")
    @Validation(required = true)
    public String ucCode;

    // 注册日期
    @NameInMap("register_date")
    @Validation(required = true)
    public String registerDate;

    // 详细地址
    @NameInMap("address_detail")
    @Validation(required = true)
    public String addressDetail;

    public static BusinessDetail build(java.util.Map<String, ?> map) throws Exception {
        BusinessDetail self = new BusinessDetail();
        return TeaModel.build(map, self);
    }

    public BusinessDetail setOperatingAddrJson(String operatingAddrJson) {
        this.operatingAddrJson = operatingAddrJson;
        return this;
    }
    public String getOperatingAddrJson() {
        return this.operatingAddrJson;
    }

    public BusinessDetail setUcCode(String ucCode) {
        this.ucCode = ucCode;
        return this;
    }
    public String getUcCode() {
        return this.ucCode;
    }

    public BusinessDetail setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public BusinessDetail setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
        return this;
    }
    public String getAddressDetail() {
        return this.addressDetail;
    }

}
