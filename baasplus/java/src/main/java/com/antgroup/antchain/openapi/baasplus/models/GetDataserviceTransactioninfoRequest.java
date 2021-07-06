// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetDataserviceTransactioninfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链唯一性标识
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 交易hash
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    public static GetDataserviceTransactioninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataserviceTransactioninfoRequest self = new GetDataserviceTransactioninfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDataserviceTransactioninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDataserviceTransactioninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDataserviceTransactioninfoRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public GetDataserviceTransactioninfoRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
