// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthUserDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通常为业务方持有的企业did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 扩展用户信息字段，用于创建did特别场景，传递更多用户信息。
    @NameInMap("extension")
    public String extension;

    // 是否实人认证，如果"T"表示已实人认证，否则未认证。
    @NameInMap("is_certified")
    public String isCertified;

    // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
    @NameInMap("signature")
    public String signature;

    // 业务方内部用户的id，可脱敏id，在一些id打通场景有特别用途。
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateAuthUserDidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthUserDidRequest self = new CreateAuthUserDidRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthUserDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthUserDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthUserDidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateAuthUserDidRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CreateAuthUserDidRequest setIsCertified(String isCertified) {
        this.isCertified = isCertified;
        return this;
    }
    public String getIsCertified() {
        return this.isCertified;
    }

    public CreateAuthUserDidRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateAuthUserDidRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
