// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthClaimUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 授权声明内容
    @NameInMap("claim_value")
    @Validation(required = true)
    public String claimValue;

    // 被授权企业did
    @NameInMap("corp_did")
    @Validation(required = true)
    public String corpDid;

    // 过期时间选项
    @NameInMap("expire_options")
    @Validation(required = true)
    public java.util.List<ValueUnitPair> expireOptions;

    // 授权是否可撤销
    @NameInMap("revocable")
    @Validation(required = true)
    public Boolean revocable;

    public static CreateAuthClaimUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthClaimUrlRequest self = new CreateAuthClaimUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthClaimUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthClaimUrlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthClaimUrlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateAuthClaimUrlRequest setClaimValue(String claimValue) {
        this.claimValue = claimValue;
        return this;
    }
    public String getClaimValue() {
        return this.claimValue;
    }

    public CreateAuthClaimUrlRequest setCorpDid(String corpDid) {
        this.corpDid = corpDid;
        return this;
    }
    public String getCorpDid() {
        return this.corpDid;
    }

    public CreateAuthClaimUrlRequest setExpireOptions(java.util.List<ValueUnitPair> expireOptions) {
        this.expireOptions = expireOptions;
        return this;
    }
    public java.util.List<ValueUnitPair> getExpireOptions() {
        return this.expireOptions;
    }

    public CreateAuthClaimUrlRequest setRevocable(Boolean revocable) {
        this.revocable = revocable;
        return this;
    }
    public Boolean getRevocable() {
        return this.revocable;
    }

}
