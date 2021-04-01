// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcShareRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 非托管的情况下必选，业务方持有的did身份。
    @NameInMap("did")
    public String did;

    // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
    @NameInMap("index")
    public String index;

    // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
    @NameInMap("signature")
    public String signature;

    // 分享声明的目标方DID
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    // 分享权限的目标可验证声明(VC)的ID
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // vc_id的owner，将持有的vc_id分享给目标target_did
    @NameInMap("owner_did")
    @Validation(required = true)
    public String ownerDid;

    public static StartAuthVcShareRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcShareRequest self = new StartAuthVcShareRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthVcShareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthVcShareRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthVcShareRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAuthVcShareRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public StartAuthVcShareRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartAuthVcShareRequest setTargetDid(String targetDid) {
        this.targetDid = targetDid;
        return this;
    }
    public String getTargetDid() {
        return this.targetDid;
    }

    public StartAuthVcShareRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public StartAuthVcShareRequest setOwnerDid(String ownerDid) {
        this.ownerDid = ownerDid;
        return this;
    }
    public String getOwnerDid() {
        return this.ownerDid;
    }

}
