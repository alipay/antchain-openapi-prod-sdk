// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class SignMerchantAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 签约请求单据号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 来源场景码, 由中台为业务方分配
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 渠道
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 商家pid
    @NameInMap("merchant_user_id")
    @Validation(required = true)
    public String merchantUserId;

    // 个人签约产品码，商户代扣场景固定GENERAL_WITHHOLDING_P
    @NameInMap("personal_product_code")
    @Validation(required = true)
    public String personalProductCode;

    public static SignMerchantAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        SignMerchantAgreementRequest self = new SignMerchantAgreementRequest();
        return TeaModel.build(map, self);
    }

    public SignMerchantAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignMerchantAgreementRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SignMerchantAgreementRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SignMerchantAgreementRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SignMerchantAgreementRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public SignMerchantAgreementRequest setPersonalProductCode(String personalProductCode) {
        this.personalProductCode = personalProductCode;
        return this;
    }
    public String getPersonalProductCode() {
        return this.personalProductCode;
    }

}
