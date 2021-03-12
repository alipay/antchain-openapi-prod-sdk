// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecBlockchainOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // data
    @NameInMap("data")
    public String data;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // user_request_id
    @NameInMap("user_request_id")
    public String userRequestId;

    public static ExecBlockchainOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainOrderRequest self = new ExecBlockchainOrderRequest();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecBlockchainOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecBlockchainOrderRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecBlockchainOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecBlockchainOrderRequest setUserRequestId(String userRequestId) {
        this.userRequestId = userRequestId;
        return this;
    }
    public String getUserRequestId() {
        return this.userRequestId;
    }

}
