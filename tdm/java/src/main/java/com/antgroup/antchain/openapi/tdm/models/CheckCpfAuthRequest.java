// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CheckCpfAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流水ID
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 用户ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 授权机构ID
    @NameInMap("authorized_identity")
    @Validation(required = true)
    public String authorizedIdentity;

    // 授权端ID
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 授权业务码
    @NameInMap("target_code")
    @Validation(required = true)
    public String targetCode;

    // 授权协议
    @NameInMap("auth_agreement")
    public AuthAgreement authAgreement;

    // 扩展字段
    @NameInMap("content")
    public String content;

    public static CheckCpfAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCpfAuthRequest self = new CheckCpfAuthRequest();
        return TeaModel.build(map, self);
    }

    public CheckCpfAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCpfAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckCpfAuthRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCpfAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public CheckCpfAuthRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public CheckCpfAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public CheckCpfAuthRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public CheckCpfAuthRequest setAuthAgreement(AuthAgreement authAgreement) {
        this.authAgreement = authAgreement;
        return this;
    }
    public AuthAgreement getAuthAgreement() {
        return this.authAgreement;
    }

    public CheckCpfAuthRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
