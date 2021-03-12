// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PushAuthUserVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪。
    @NameInMap("biz_id")
    @Validation(required = true, maxLength = 64)
    public String bizId;

    // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32)
    public String bizType;

    // 推送的业务方自己所属的did，也就是颁发此声明的 issuer
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则：
    // 1. Map<String,String> params 的key按照字典序排序
    // 2. 拼接为 key1=value1&key2=value2&key3=value3 ...
    // 3. 计算sha256(第2步结果)得到hash
    // 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 通过DIS颁发的声明详细信息，其中content的claim字段是和业务相关的实际声明内容。
    @NameInMap("vc_content")
    @Validation(required = true)
    public String vcContent;

    public static PushAuthUserVcRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAuthUserVcRequest self = new PushAuthUserVcRequest();
        return TeaModel.build(map, self);
    }

    public PushAuthUserVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAuthUserVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAuthUserVcRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushAuthUserVcRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PushAuthUserVcRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public PushAuthUserVcRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public PushAuthUserVcRequest setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

}
