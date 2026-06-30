// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class Insured extends TeaModel {
    // 被保人名称
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("insured_name")
    @Validation(required = true, maxLength = 32)
    public String insuredName;

    // 被保人证件类型
    /**
     * <strong>example:</strong>
     * <p>01--居民身份证、03--营业执照</p>
     */
    @NameInMap("insured_card_type")
    @Validation(required = true, maxLength = 32)
    public String insuredCardType;

    // 被保人证件号码
    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("insured_card_code")
    @Validation(required = true, maxLength = 32)
    public String insuredCardCode;

    // 被保人联系方式
    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("insured_contact_info")
    @Validation(maxLength = 128)
    public String insuredContactInfo;

    public static Insured build(java.util.Map<String, ?> map) throws Exception {
        Insured self = new Insured();
        return TeaModel.build(map, self);
    }

    public Insured setInsuredName(String insuredName) {
        this.insuredName = insuredName;
        return this;
    }
    public String getInsuredName() {
        return this.insuredName;
    }

    public Insured setInsuredCardType(String insuredCardType) {
        this.insuredCardType = insuredCardType;
        return this;
    }
    public String getInsuredCardType() {
        return this.insuredCardType;
    }

    public Insured setInsuredCardCode(String insuredCardCode) {
        this.insuredCardCode = insuredCardCode;
        return this;
    }
    public String getInsuredCardCode() {
        return this.insuredCardCode;
    }

    public Insured setInsuredContactInfo(String insuredContactInfo) {
        this.insuredContactInfo = insuredContactInfo;
        return this;
    }
    public String getInsuredContactInfo() {
        return this.insuredContactInfo;
    }

}
