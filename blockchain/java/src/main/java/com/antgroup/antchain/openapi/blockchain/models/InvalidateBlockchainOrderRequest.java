// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InvalidateBlockchainOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参数
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 区域信息
    @NameInMap("region_id")
    public String regionId;

    // 用户请求信息
    @NameInMap("user_request_id")
    public String userRequestId;

    public static InvalidateBlockchainOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        InvalidateBlockchainOrderRequest self = new InvalidateBlockchainOrderRequest();
        return TeaModel.build(map, self);
    }

    public InvalidateBlockchainOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InvalidateBlockchainOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InvalidateBlockchainOrderRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InvalidateBlockchainOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InvalidateBlockchainOrderRequest setUserRequestId(String userRequestId) {
        this.userRequestId = userRequestId;
        return this;
    }
    public String getUserRequestId() {
        return this.userRequestId;
    }

}
