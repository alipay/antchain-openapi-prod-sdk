// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class VerifyServiceaccountSignatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 系统来源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // AK
    // 
    @NameInMap("user_access_key")
    @Validation(required = true)
    public String userAccessKey;

    // aksk加签结果
    @NameInMap("signature_result")
    @Validation(required = true)
    public String signatureResult;

    // 待加签内容
    @NameInMap("signature_text")
    @Validation(required = true)
    public String signatureText;

    // 加签算法
    @NameInMap("signature_algorithm")
    @Validation(required = true)
    public String signatureAlgorithm;

    // 租户名称，八位字母
    @NameInMap("tenant_name")
    public String tenantName;

    public static VerifyServiceaccountSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyServiceaccountSignatureRequest self = new VerifyServiceaccountSignatureRequest();
        return TeaModel.build(map, self);
    }

    public VerifyServiceaccountSignatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyServiceaccountSignatureRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public VerifyServiceaccountSignatureRequest setUserAccessKey(String userAccessKey) {
        this.userAccessKey = userAccessKey;
        return this;
    }
    public String getUserAccessKey() {
        return this.userAccessKey;
    }

    public VerifyServiceaccountSignatureRequest setSignatureResult(String signatureResult) {
        this.signatureResult = signatureResult;
        return this;
    }
    public String getSignatureResult() {
        return this.signatureResult;
    }

    public VerifyServiceaccountSignatureRequest setSignatureText(String signatureText) {
        this.signatureText = signatureText;
        return this;
    }
    public String getSignatureText() {
        return this.signatureText;
    }

    public VerifyServiceaccountSignatureRequest setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public VerifyServiceaccountSignatureRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
