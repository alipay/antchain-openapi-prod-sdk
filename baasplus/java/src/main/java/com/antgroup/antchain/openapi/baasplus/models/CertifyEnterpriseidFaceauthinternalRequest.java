// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CertifyEnterpriseidFaceauthinternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 认证的唯一性标示
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 回调通知地址
    // 
    @NameInMap("callback_url")
    public String callbackUrl;

    // https://www.example.com/redircet	
    @NameInMap("redirect_url")
    public String redirectUrl;

    public static CertifyEnterpriseidFaceauthinternalRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyEnterpriseidFaceauthinternalRequest self = new CertifyEnterpriseidFaceauthinternalRequest();
        return TeaModel.build(map, self);
    }

    public CertifyEnterpriseidFaceauthinternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyEnterpriseidFaceauthinternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyEnterpriseidFaceauthinternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public CertifyEnterpriseidFaceauthinternalRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CertifyEnterpriseidFaceauthinternalRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CertifyEnterpriseidFaceauthinternalRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

}
