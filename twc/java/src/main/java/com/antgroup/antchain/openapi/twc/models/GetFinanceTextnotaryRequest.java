// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetFinanceTextnotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 位置信息
    @NameInMap("location")
    public Location location;

    // 存证阶段
    @NameInMap("phase")
    public String phase;

    // 扩展属性，用户可自行维护
    @NameInMap("properties")
    public String properties;

    // 存证事务ID
    @NameInMap("transaction_id")
    public String transactionId;

    // 交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static GetFinanceTextnotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFinanceTextnotaryRequest self = new GetFinanceTextnotaryRequest();
        return TeaModel.build(map, self);
    }

    public GetFinanceTextnotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetFinanceTextnotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetFinanceTextnotaryRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public GetFinanceTextnotaryRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetFinanceTextnotaryRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public GetFinanceTextnotaryRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public GetFinanceTextnotaryRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
