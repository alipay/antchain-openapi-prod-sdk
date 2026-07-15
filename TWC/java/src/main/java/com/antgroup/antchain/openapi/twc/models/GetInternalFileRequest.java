// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetInternalFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证凭据，需要先调用内部文本存证接口twc.notary.internal.file.create创建存证
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    public String phase;

    // 存证事务id，通过twc.notary.internal.trans.create(创建存证事务)获得
    @NameInMap("transaction_id")
    public String transactionId;

    // 存证地点信息(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 代理客户存证时，实际用户的租户ID
    @NameInMap("real_tenant")
    public String realTenant;

    // 授权码
    // 
    @NameInMap("auth_code")
    public String authCode;

    // 授权码对应产品码
    @NameInMap("product")
    public String product;

    public static GetInternalFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInternalFileRequest self = new GetInternalFileRequest();
        return TeaModel.build(map, self);
    }

    public GetInternalFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInternalFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetInternalFileRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public GetInternalFileRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetInternalFileRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public GetInternalFileRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public GetInternalFileRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public GetInternalFileRequest setRealTenant(String realTenant) {
        this.realTenant = realTenant;
        return this;
    }
    public String getRealTenant() {
        return this.realTenant;
    }

    public GetInternalFileRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetInternalFileRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
