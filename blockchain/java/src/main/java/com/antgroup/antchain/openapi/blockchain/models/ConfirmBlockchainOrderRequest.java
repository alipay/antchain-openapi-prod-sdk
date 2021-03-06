// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ConfirmBlockchainOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // user_request_id
    @NameInMap("user_request_id")
    public String userRequestId;

    public static ConfirmBlockchainOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmBlockchainOrderRequest self = new ConfirmBlockchainOrderRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmBlockchainOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmBlockchainOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmBlockchainOrderRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ConfirmBlockchainOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfirmBlockchainOrderRequest setUserRequestId(String userRequestId) {
        this.userRequestId = userRequestId;
        return this;
    }
    public String getUserRequestId() {
        return this.userRequestId;
    }

}
