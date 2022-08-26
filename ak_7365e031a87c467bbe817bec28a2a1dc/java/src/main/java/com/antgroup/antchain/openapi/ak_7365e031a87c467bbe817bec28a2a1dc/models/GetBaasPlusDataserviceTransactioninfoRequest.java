// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class GetBaasPlusDataserviceTransactioninfoRequest extends TeaModel {
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

    public static GetBaasPlusDataserviceTransactioninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaasPlusDataserviceTransactioninfoRequest self = new GetBaasPlusDataserviceTransactioninfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBaasPlusDataserviceTransactioninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBaasPlusDataserviceTransactioninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBaasPlusDataserviceTransactioninfoRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public GetBaasPlusDataserviceTransactioninfoRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
