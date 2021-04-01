// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SavePlatformDepositDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 存证数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 用户的did地址
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 任意用户自定义的keyId(需要唯一)，根据该keyId可以查找存证的内容，若不填则使用txHash作为keyId
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    public static SavePlatformDepositDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        SavePlatformDepositDepositRequest self = new SavePlatformDepositDepositRequest();
        return TeaModel.build(map, self);
    }

    public SavePlatformDepositDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SavePlatformDepositDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SavePlatformDepositDepositRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SavePlatformDepositDepositRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SavePlatformDepositDepositRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public SavePlatformDepositDepositRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
