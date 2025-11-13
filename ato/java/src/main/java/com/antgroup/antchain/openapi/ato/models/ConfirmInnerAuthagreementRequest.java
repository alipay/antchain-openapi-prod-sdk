// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ConfirmInnerAuthagreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 主体类型，如MERCHNAT/USER
    @NameInMap("subject_type")
    @Validation(required = true)
    public String subjectType;

    // 协议code
    @NameInMap("agreement_code")
    @Validation(required = true)
    public String agreementCode;

    // 协议版本
    @NameInMap("agreement_version")
    public Long agreementVersion;

    public static ConfirmInnerAuthagreementRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmInnerAuthagreementRequest self = new ConfirmInnerAuthagreementRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmInnerAuthagreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmInnerAuthagreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmInnerAuthagreementRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ConfirmInnerAuthagreementRequest setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }
    public String getSubjectType() {
        return this.subjectType;
    }

    public ConfirmInnerAuthagreementRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

    public ConfirmInnerAuthagreementRequest setAgreementVersion(Long agreementVersion) {
        this.agreementVersion = agreementVersion;
        return this;
    }
    public Long getAgreementVersion() {
        return this.agreementVersion;
    }

}
