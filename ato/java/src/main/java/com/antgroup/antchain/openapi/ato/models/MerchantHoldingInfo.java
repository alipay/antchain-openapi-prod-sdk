// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantHoldingInfo extends TeaModel {
    // 控股类型名称
    // 企业股东:ENTERPRISE_SHAREHOLDER
    // 个人股东:PERSONAL_SHAREHOLDER
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE_SHAREHOLDER</p>
     */
    @NameInMap("holding_type_name")
    @Validation(required = true)
    public String holdingTypeName;

    // 控股公司名称
    /**
     * <strong>example:</strong>
     * <p>xxx公司</p>
     */
    @NameInMap("holding_company")
    @Validation(required = true)
    public String holdingCompany;

    // 证件号码
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("certificate_number")
    @Validation(required = true)
    public String certificateNumber;

    // 证件是否长期有效
    // 长期true，
    // 否则false
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("long_date")
    @Validation(required = true)
    public Boolean longDate;

    // 失效时间
    // 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
    /**
     * <strong>example:</strong>
     * <p>2022-10-10</p>
     */
    @NameInMap("expire_date")
    public String expireDate;

    public static MerchantHoldingInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantHoldingInfo self = new MerchantHoldingInfo();
        return TeaModel.build(map, self);
    }

    public MerchantHoldingInfo setHoldingTypeName(String holdingTypeName) {
        this.holdingTypeName = holdingTypeName;
        return this;
    }
    public String getHoldingTypeName() {
        return this.holdingTypeName;
    }

    public MerchantHoldingInfo setHoldingCompany(String holdingCompany) {
        this.holdingCompany = holdingCompany;
        return this;
    }
    public String getHoldingCompany() {
        return this.holdingCompany;
    }

    public MerchantHoldingInfo setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public MerchantHoldingInfo setLongDate(Boolean longDate) {
        this.longDate = longDate;
        return this;
    }
    public Boolean getLongDate() {
        return this.longDate;
    }

    public MerchantHoldingInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

}
