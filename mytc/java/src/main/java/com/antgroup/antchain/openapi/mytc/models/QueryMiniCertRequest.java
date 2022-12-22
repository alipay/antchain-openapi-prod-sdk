// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryMiniCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 溯源码信息
    @NameInMap("code")
    @Validation(required = true, maxLength = 160)
    public String code;

    // 交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true, maxLength = 64)
    public String txHash;

    public static QueryMiniCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniCertRequest self = new QueryMiniCertRequest();
        return TeaModel.build(map, self);
    }

    public QueryMiniCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMiniCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMiniCertRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMiniCertRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
