// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetCourtFilenotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 地理位置信息
    @NameInMap("location")
    public Location location;

    // 存证阶段
    @NameInMap("phase")
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 存证事务ID
    @NameInMap("transaction_id")
    public String transactionId;

    // 交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static GetCourtFilenotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCourtFilenotaryRequest self = new GetCourtFilenotaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCourtFilenotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCourtFilenotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetCourtFilenotaryRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public GetCourtFilenotaryRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetCourtFilenotaryRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public GetCourtFilenotaryRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public GetCourtFilenotaryRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
