// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UnbindContractPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id，平台方用户创建时生成的id。用户解约失败时该字段会通过解约申请消息透传给商家。
    @NameInMap("user_tuid")
    @Validation(required = true)
    public String userTuid;

    // 外部代扣协议号，用户解约失败时该字段会通过解约申请消息透传给商家。
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    // 是否允许解约
    @NameInMap("allow_unsign")
    @Validation(required = true)
    public Boolean allowUnsign;

    public static UnbindContractPayRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindContractPayRequest self = new UnbindContractPayRequest();
        return TeaModel.build(map, self);
    }

    public UnbindContractPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindContractPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindContractPayRequest setUserTuid(String userTuid) {
        this.userTuid = userTuid;
        return this;
    }
    public String getUserTuid() {
        return this.userTuid;
    }

    public UnbindContractPayRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public UnbindContractPayRequest setAllowUnsign(Boolean allowUnsign) {
        this.allowUnsign = allowUnsign;
        return this;
    }
    public Boolean getAllowUnsign() {
        return this.allowUnsign;
    }

}
