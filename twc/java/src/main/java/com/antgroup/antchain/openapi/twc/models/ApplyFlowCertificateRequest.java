// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyFlowCertificateRequest extends TeaModel {
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
    @Validation(required = true)
    public String orgId;

    // 是否需要legal码，默认为false即不需要，true表示需要
    @NameInMap("need_legal_code")
    public Boolean needLegalCode;

    public static ApplyFlowCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFlowCertificateRequest self = new ApplyFlowCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFlowCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyFlowCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyFlowCertificateRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ApplyFlowCertificateRequest setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public ApplyFlowCertificateRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ApplyFlowCertificateRequest setNeedLegalCode(Boolean needLegalCode) {
        this.needLegalCode = needLegalCode;
        return this;
    }
    public Boolean getNeedLegalCode() {
        return this.needLegalCode;
    }

}
