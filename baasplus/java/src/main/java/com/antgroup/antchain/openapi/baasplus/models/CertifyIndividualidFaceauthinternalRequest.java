// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CertifyIndividualidFaceauthinternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回调通知地址
    @NameInMap("callback_url")
    public String callbackUrl;

    // 认证的唯一性id
    // 
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 认证完成后回跳地址
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    public static CertifyIndividualidFaceauthinternalRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyIndividualidFaceauthinternalRequest self = new CertifyIndividualidFaceauthinternalRequest();
        return TeaModel.build(map, self);
    }

    public CertifyIndividualidFaceauthinternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyIndividualidFaceauthinternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyIndividualidFaceauthinternalRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CertifyIndividualidFaceauthinternalRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CertifyIndividualidFaceauthinternalRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public CertifyIndividualidFaceauthinternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

}
