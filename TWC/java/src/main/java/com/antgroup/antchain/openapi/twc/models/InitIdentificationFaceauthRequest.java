// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitIdentificationFaceauthRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证人的姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 被验证者的身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 授权码，针对某些特定场景使用，非必填
    @NameInMap("auth_code")
    public String authCode;

    public static InitIdentificationFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIdentificationFaceauthRequest self = new InitIdentificationFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public InitIdentificationFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIdentificationFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIdentificationFaceauthRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitIdentificationFaceauthRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitIdentificationFaceauthRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
