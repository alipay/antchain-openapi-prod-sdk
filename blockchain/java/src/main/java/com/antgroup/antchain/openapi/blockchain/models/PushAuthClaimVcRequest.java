// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PushAuthClaimVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 申请授权的具体内容，通常由业务方对接定义，在小程序展示声明详细内容给用户，用户进行确认后，授权颁发声明。
    @NameInMap("claim_content")
    @Validation(required = true)
    public String claimContent;

    // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
    @NameInMap("claim_type")
    public String claimType;

    // 业务方持有的did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
    @NameInMap("expire")
    public Long expire;

    // 申请目标did身份持有者，对声明进行授权颁发。
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则：
    // 1. Map<String,String> params 的key按照字典序排序
    // 2. 拼接为 key1=value1&key2=value2&key3=value3 ...
    // 3. 计算sha256(第2步结果)得到hash
    // 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static PushAuthClaimVcRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAuthClaimVcRequest self = new PushAuthClaimVcRequest();
        return TeaModel.build(map, self);
    }

    public PushAuthClaimVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAuthClaimVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAuthClaimVcRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushAuthClaimVcRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PushAuthClaimVcRequest setClaimContent(String claimContent) {
        this.claimContent = claimContent;
        return this;
    }
    public String getClaimContent() {
        return this.claimContent;
    }

    public PushAuthClaimVcRequest setClaimType(String claimType) {
        this.claimType = claimType;
        return this;
    }
    public String getClaimType() {
        return this.claimType;
    }

    public PushAuthClaimVcRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public PushAuthClaimVcRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public PushAuthClaimVcRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public PushAuthClaimVcRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
