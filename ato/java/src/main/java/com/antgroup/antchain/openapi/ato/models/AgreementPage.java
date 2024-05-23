// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AgreementPage extends TeaModel {
    // 协议id
    @NameInMap("agreement_id")
    @Validation(required = true)
    public String agreementId;

    // 代理企业名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务类型 枚举
    @NameInMap("product_main_class")
    @Validation(required = true)
    public String productMainClass;

    // 协议类型 枚举
    @NameInMap("agreement_type")
    @Validation(required = true)
    public String agreementType;

    // 租户签约状态 枚举
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    public static AgreementPage build(java.util.Map<String, ?> map) throws Exception {
        AgreementPage self = new AgreementPage();
        return TeaModel.build(map, self);
    }

    public AgreementPage setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public AgreementPage setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public AgreementPage setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AgreementPage setProductMainClass(String productMainClass) {
        this.productMainClass = productMainClass;
        return this;
    }
    public String getProductMainClass() {
        return this.productMainClass;
    }

    public AgreementPage setAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }
    public String getAgreementType() {
        return this.agreementType;
    }

    public AgreementPage setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

}
