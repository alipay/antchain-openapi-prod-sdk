// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class VerifyCpfAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 用户身份证ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 授权机构ID
    @NameInMap("authorized_identity")
    @Validation(required = true)
    public String authorizedIdentity;

    // 授权端ID
    @NameInMap("authorized_platform_identity")
    public String authorizedPlatformIdentity;

    // 授权业务码
    @NameInMap("target_code")
    @Validation(required = true)
    public String targetCode;

    // 授权协议
    @NameInMap("auth_agreement")
    @Validation(required = true)
    public AuthAgreement authAgreement;

    // 扩展参数
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static VerifyCpfAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCpfAuthRequest self = new VerifyCpfAuthRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCpfAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyCpfAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyCpfAuthRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyCpfAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public VerifyCpfAuthRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public VerifyCpfAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public VerifyCpfAuthRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public VerifyCpfAuthRequest setAuthAgreement(AuthAgreement authAgreement) {
        this.authAgreement = authAgreement;
        return this;
    }
    public AuthAgreement getAuthAgreement() {
        return this.authAgreement;
    }

    public VerifyCpfAuthRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
