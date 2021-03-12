// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ConnectBlockchainOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // message
    @NameInMap("message")
    public String message;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static ConnectBlockchainOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ConnectBlockchainOrderRequest self = new ConnectBlockchainOrderRequest();
        return TeaModel.build(map, self);
    }

    public ConnectBlockchainOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConnectBlockchainOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConnectBlockchainOrderRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConnectBlockchainOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
