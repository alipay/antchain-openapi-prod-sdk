// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAkdfUserbizkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 密钥名称
    @NameInMap("key_name")
    @Validation(required = true)
    public String keyName;

    public static GetAkdfUserbizkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAkdfUserbizkeyRequest self = new GetAkdfUserbizkeyRequest();
        return TeaModel.build(map, self);
    }

    public GetAkdfUserbizkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAkdfUserbizkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAkdfUserbizkeyRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public GetAkdfUserbizkeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

}
