// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessContractreceiptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链的bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 调用者用户did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 链上交易txHash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static QueryBusinessContractreceiptRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessContractreceiptRequest self = new QueryBusinessContractreceiptRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessContractreceiptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessContractreceiptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessContractreceiptRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBusinessContractreceiptRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBusinessContractreceiptRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
