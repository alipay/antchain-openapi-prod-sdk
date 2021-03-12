// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveBusinessDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId    
    // 
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 存证的内容
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 用户的did地址
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 任意用户自定义的keyId(需要唯一)，根据该keyId可以查找存证的内容，若不填则使用txHash作为keyId
    @NameInMap("key_id")
    public String keyId;

    public static SaveBusinessDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBusinessDepositRequest self = new SaveBusinessDepositRequest();
        return TeaModel.build(map, self);
    }

    public SaveBusinessDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBusinessDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBusinessDepositRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveBusinessDepositRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveBusinessDepositRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public SaveBusinessDepositRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
