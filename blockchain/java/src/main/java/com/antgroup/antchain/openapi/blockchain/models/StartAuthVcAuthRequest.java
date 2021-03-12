// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcAuthRequest extends TeaModel {
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

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 一个json的string。内容包含具体需要的声明，不同业务场景不同。
    @NameInMap("claim_content")
    @Validation(required = true)
    public String claimContent;

    // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
    @NameInMap("claim_type")
    public String claimType;

    // 非托管的情况下必选，业务方持有的did身份。
    @NameInMap("did")
    public String did;

    // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
    @NameInMap("expire")
    public Long expire;

    // 业务方可以传递的附加信息，通常跟可验证声明的claim有关，目前是可选项，将来业务复杂后，需要指定claim类型，或者附加信息内容说明。
    @NameInMap("extension")
    public String extension;

    // 非托管的情况下必选。
    // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
    @NameInMap("signature")
    public String signature;

    // 涉及的C类用户身份信息，如果是支付宝体系内，需要提供userId，并且提供二要素信息(name，certNo)
    @NameInMap("user_info")
    @Validation(required = true)
    public String userInfo;

    public static StartAuthVcAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcAuthRequest self = new StartAuthVcAuthRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthVcAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthVcAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthVcAuthRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVcAuthRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVcAuthRequest setClaimContent(String claimContent) {
        this.claimContent = claimContent;
        return this;
    }
    public String getClaimContent() {
        return this.claimContent;
    }

    public StartAuthVcAuthRequest setClaimType(String claimType) {
        this.claimType = claimType;
        return this;
    }
    public String getClaimType() {
        return this.claimType;
    }

    public StartAuthVcAuthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAuthVcAuthRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public StartAuthVcAuthRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public StartAuthVcAuthRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartAuthVcAuthRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

}
