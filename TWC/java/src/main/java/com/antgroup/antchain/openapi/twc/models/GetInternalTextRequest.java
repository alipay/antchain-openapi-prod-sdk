// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetInternalTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 存证事务id
    @NameInMap("transaction_id")
    public String transactionId;

    // 存证凭据
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 租户
    @NameInMap("real_tenant")
    public String realTenant;

    // 授权码
    @NameInMap("auth_code")
    public String authCode;

    // 产品码
    @NameInMap("product")
    public String product;

    public static GetInternalTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInternalTextRequest self = new GetInternalTextRequest();
        return TeaModel.build(map, self);
    }

    public GetInternalTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInternalTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetInternalTextRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public GetInternalTextRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetInternalTextRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public GetInternalTextRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public GetInternalTextRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public GetInternalTextRequest setRealTenant(String realTenant) {
        this.realTenant = realTenant;
        return this;
    }
    public String getRealTenant() {
        return this.realTenant;
    }

    public GetInternalTextRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetInternalTextRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
