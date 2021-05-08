// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class InitVerifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权机构ID（统一社会信用代码）
    @NameInMap("authorized_identity")
    @Validation(required = true)
    public String authorizedIdentity;

    // 核身发起端
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 刷脸产品类型
    @NameInMap("certification_type")
    @Validation(required = true)
    public String certificationType;

    // 核身初始化请求信息
    @NameInMap("certification_request")
    @Validation(required = true)
    public String certificationRequest;

    public static InitVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitVerifyRequest self = new InitVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitVerifyRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public InitVerifyRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public InitVerifyRequest setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public InitVerifyRequest setCertificationRequest(String certificationRequest) {
        this.certificationRequest = certificationRequest;
        return this;
    }
    public String getCertificationRequest() {
        return this.certificationRequest;
    }

}
