// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveBusinessDepositEncryptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId    
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 要加密存储的内容
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 用户did地址
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 业务唯一id，只需要本用户的应用唯一即可，因为最终会与用户的accountId拼接起来
    @NameInMap("key_id")
    public String keyId;

    public static SaveBusinessDepositEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBusinessDepositEncryptRequest self = new SaveBusinessDepositEncryptRequest();
        return TeaModel.build(map, self);
    }

    public SaveBusinessDepositEncryptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBusinessDepositEncryptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBusinessDepositEncryptRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveBusinessDepositEncryptRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveBusinessDepositEncryptRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public SaveBusinessDepositEncryptRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
