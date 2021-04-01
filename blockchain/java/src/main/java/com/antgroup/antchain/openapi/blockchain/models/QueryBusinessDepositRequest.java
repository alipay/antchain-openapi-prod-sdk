// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId    
    // 
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 用户did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 存证数据业务逻辑id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 存证数据对应的链上交易哈希，若无则返回最新的交易哈希。
    @NameInMap("tx_hash")
    public String txHash;

    public static QueryBusinessDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessDepositRequest self = new QueryBusinessDepositRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessDepositRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBusinessDepositRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBusinessDepositRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QueryBusinessDepositRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
