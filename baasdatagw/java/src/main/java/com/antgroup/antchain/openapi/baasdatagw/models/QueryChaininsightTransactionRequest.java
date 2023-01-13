// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 交易ID
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    // hex编码的TEE交易解密Key，留空表示不解密
    @NameInMap("tee_key")
    public String teeKey;

    public static QueryChaininsightTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightTransactionRequest self = new QueryChaininsightTransactionRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightTransactionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightTransactionRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public QueryChaininsightTransactionRequest setTeeKey(String teeKey) {
        this.teeKey = teeKey;
        return this;
    }
    public String getTeeKey() {
        return this.teeKey;
    }

}
