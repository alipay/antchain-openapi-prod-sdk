// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitIndividualidFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证
    // 默认为FACE
    @NameInMap("biz_code")
    public String bizCode;

    public static InitIndividualidFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIndividualidFaceauthRequest self = new InitIndividualidFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public InitIndividualidFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIndividualidFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIndividualidFaceauthRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitIndividualidFaceauthRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitIndividualidFaceauthRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
