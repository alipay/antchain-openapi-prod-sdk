// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthCertClaimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    // 
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 一个json的string。内容包含具体需要的声明，不同业务场景不同。
    // 
    @NameInMap("claim_content")
    @Validation(required = true)
    public String claimContent;

    // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
    // 
    @NameInMap("claim_type")
    public String claimType;

    // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
    // 
    @NameInMap("expire")
    public Long expire;

    public static CreateAuthCertClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthCertClaimRequest self = new CreateAuthCertClaimRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthCertClaimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthCertClaimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthCertClaimRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAuthCertClaimRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateAuthCertClaimRequest setClaimContent(String claimContent) {
        this.claimContent = claimContent;
        return this;
    }
    public String getClaimContent() {
        return this.claimContent;
    }

    public CreateAuthCertClaimRequest setClaimType(String claimType) {
        this.claimType = claimType;
        return this;
    }
    public String getClaimType() {
        return this.claimType;
    }

    public CreateAuthCertClaimRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

}
