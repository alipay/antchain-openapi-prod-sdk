// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class SignAgreementAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 隐私协议号
    @NameInMap("privacy_agreement_no")
    public String privacyAgreementNo;

    // 用户协议号
    @NameInMap("user_agreement_no")
    public String userAgreementNo;

    // 小程序用户openId
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 签署时间
    @NameInMap("sign_time")
    public String signTime;

    public static SignAgreementAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SignAgreementAppRequest self = new SignAgreementAppRequest();
        return TeaModel.build(map, self);
    }

    public SignAgreementAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignAgreementAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignAgreementAppRequest setPrivacyAgreementNo(String privacyAgreementNo) {
        this.privacyAgreementNo = privacyAgreementNo;
        return this;
    }
    public String getPrivacyAgreementNo() {
        return this.privacyAgreementNo;
    }

    public SignAgreementAppRequest setUserAgreementNo(String userAgreementNo) {
        this.userAgreementNo = userAgreementNo;
        return this;
    }
    public String getUserAgreementNo() {
        return this.userAgreementNo;
    }

    public SignAgreementAppRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public SignAgreementAppRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

}
