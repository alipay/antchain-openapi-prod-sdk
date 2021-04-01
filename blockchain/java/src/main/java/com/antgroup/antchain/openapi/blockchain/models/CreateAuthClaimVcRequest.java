// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthClaimVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 被授权者did
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 授权内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 授权发起者did
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 过期时间，长期为-1, 单位为毫秒
    @NameInMap("expire")
    @Validation(required = true)
    public Long expire;

    // 授权是否可撤销
    @NameInMap("revocable")
    @Validation(required = true)
    public Boolean revocable;

    public static CreateAuthClaimVcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthClaimVcRequest self = new CreateAuthClaimVcRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthClaimVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthClaimVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthClaimVcRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateAuthClaimVcRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAuthClaimVcRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public CreateAuthClaimVcRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateAuthClaimVcRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public CreateAuthClaimVcRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public CreateAuthClaimVcRequest setRevocable(Boolean revocable) {
        this.revocable = revocable;
        return this;
    }
    public Boolean getRevocable() {
        return this.revocable;
    }

}
