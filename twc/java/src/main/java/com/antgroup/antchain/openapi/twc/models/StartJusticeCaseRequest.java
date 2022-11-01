// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class StartJusticeCaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件Id,创建案件返回的id
    @NameInMap("case_id")
    @Validation(required = true)
    public Long caseId;

    // 处置端租户ID
    @NameInMap("isv_tenant_id")
    @Validation(required = true)
    public String isvTenantId;

    // 处置方式
    // JUDICIAL_MEDIATION-司法调解
    @NameInMap("judicial_biz_type")
    @Validation(required = true)
    public String judicialBizType;

    // 司法调解基础参数, 当处置方式为5, 必填.
    @NameInMap("judicial_mediation_param")
    public JudicialMediationBaseParamInfo judicialMediationParam;

    // 调解沟通联系人(如果不传则使用租户维度的配置信息)
    @NameInMap("contact_info")
    public ContactInfo contactInfo;

    // 调解回款银行账户(如果不传则使用租户维度的配置信息)
    @NameInMap("bank_account_info")
    public BankAccountInfo bankAccountInfo;

    // 维权类型为仲裁时填写:SIGN_SILENTLY-静默签署,SIGN_MANUALLY-人工签署
    @NameInMap("sign_method")
    public String signMethod;

    public static StartJusticeCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJusticeCaseRequest self = new StartJusticeCaseRequest();
        return TeaModel.build(map, self);
    }

    public StartJusticeCaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartJusticeCaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartJusticeCaseRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public StartJusticeCaseRequest setIsvTenantId(String isvTenantId) {
        this.isvTenantId = isvTenantId;
        return this;
    }
    public String getIsvTenantId() {
        return this.isvTenantId;
    }

    public StartJusticeCaseRequest setJudicialBizType(String judicialBizType) {
        this.judicialBizType = judicialBizType;
        return this;
    }
    public String getJudicialBizType() {
        return this.judicialBizType;
    }

    public StartJusticeCaseRequest setJudicialMediationParam(JudicialMediationBaseParamInfo judicialMediationParam) {
        this.judicialMediationParam = judicialMediationParam;
        return this;
    }
    public JudicialMediationBaseParamInfo getJudicialMediationParam() {
        return this.judicialMediationParam;
    }

    public StartJusticeCaseRequest setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public StartJusticeCaseRequest setBankAccountInfo(BankAccountInfo bankAccountInfo) {
        this.bankAccountInfo = bankAccountInfo;
        return this;
    }
    public BankAccountInfo getBankAccountInfo() {
        return this.bankAccountInfo;
    }

    public StartJusticeCaseRequest setSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }
    public String getSignMethod() {
        return this.signMethod;
    }

}
