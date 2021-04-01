// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAccountSignatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加密算法
    @NameInMap("algorithm")
    @Validation(required = true)
    public String algorithm;

    // 区块链唯一标示
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 用户需要签名的原始数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 签名账户在原系统中的唯一标示
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    public static StartAccountSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAccountSignatureRequest self = new StartAccountSignatureRequest();
        return TeaModel.build(map, self);
    }

    public StartAccountSignatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAccountSignatureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAccountSignatureRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public StartAccountSignatureRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public StartAccountSignatureRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StartAccountSignatureRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
