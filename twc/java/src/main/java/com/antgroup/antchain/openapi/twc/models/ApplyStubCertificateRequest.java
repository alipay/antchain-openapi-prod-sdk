// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyStubCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 证书类型，AntchainCertification（蚂蚁链存证证明）、OrgCertification（公证处存证证明），目前支持公证处
    @NameInMap("certification_type")
    @Validation(required = true)
    public String certificationType;

    // 公证处ID，OrgCertification（公证处存证证明）选填，不填则为默认公证处
    @NameInMap("org_id")
    public String orgId;

    // 是否需要legal码，默认为false即不需要，true表示需要
    @NameInMap("need_legal_code")
    public Boolean needLegalCode;

    public static ApplyStubCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyStubCertificateRequest self = new ApplyStubCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyStubCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyStubCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyStubCertificateRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ApplyStubCertificateRequest setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public ApplyStubCertificateRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ApplyStubCertificateRequest setNeedLegalCode(Boolean needLegalCode) {
        this.needLegalCode = needLegalCode;
        return this;
    }
    public Boolean getNeedLegalCode() {
        return this.needLegalCode;
    }

}
