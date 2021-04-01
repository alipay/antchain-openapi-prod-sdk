// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessDepositEncryptedmetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链的业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 发起者的did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 存证的唯一主键key_id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 被存证的交易txHash，若不传则默认key_id最近的交易hash
    @NameInMap("tx_hash")
    public String txHash;

    public static QueryBusinessDepositEncryptedmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessDepositEncryptedmetadataRequest self = new QueryBusinessDepositEncryptedmetadataRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessDepositEncryptedmetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessDepositEncryptedmetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessDepositEncryptedmetadataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBusinessDepositEncryptedmetadataRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBusinessDepositEncryptedmetadataRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QueryBusinessDepositEncryptedmetadataRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
