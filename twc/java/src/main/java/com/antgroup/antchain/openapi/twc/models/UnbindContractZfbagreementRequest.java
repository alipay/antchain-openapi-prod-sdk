// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UnbindContractZfbagreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户2088id
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    // 外部代扣协议号
    @NameInMap("agreement_no")
    @Validation(required = true)
    public String agreementNo;

    // 申请解约-APPLY_UNSIGN
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 申请解约时间
    @NameInMap("unsign_time")
    @Validation(required = true)
    public String unsignTime;

    // appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    public static UnbindContractZfbagreementRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindContractZfbagreementRequest self = new UnbindContractZfbagreementRequest();
        return TeaModel.build(map, self);
    }

    public UnbindContractZfbagreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindContractZfbagreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindContractZfbagreementRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public UnbindContractZfbagreementRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public UnbindContractZfbagreementRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UnbindContractZfbagreementRequest setUnsignTime(String unsignTime) {
        this.unsignTime = unsignTime;
        return this;
    }
    public String getUnsignTime() {
        return this.unsignTime;
    }

    public UnbindContractZfbagreementRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
