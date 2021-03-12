// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckBlockchainOrderRequest extends TeaModel {
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

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // 用户请求ID
    @NameInMap("user_request_id")
    public String userRequestId;

    public static CheckBlockchainOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBlockchainOrderRequest self = new CheckBlockchainOrderRequest();
        return TeaModel.build(map, self);
    }

    public CheckBlockchainOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckBlockchainOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckBlockchainOrderRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckBlockchainOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckBlockchainOrderRequest setUserRequestId(String userRequestId) {
        this.userRequestId = userRequestId;
        return this;
    }
    public String getUserRequestId() {
        return this.userRequestId;
    }

}
