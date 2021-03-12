// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetNotaryTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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
    @NameInMap("token")
    public String token;

    // 存证凭据
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static GetNotaryTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryTextRequest self = new GetNotaryTextRequest();
        return TeaModel.build(map, self);
    }

    public GetNotaryTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetNotaryTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetNotaryTextRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public GetNotaryTextRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetNotaryTextRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public GetNotaryTextRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetNotaryTextRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
