// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VerifyBlockchainOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参数信息
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 区域信息
    @NameInMap("region_id")
    public String regionId;

    // 用户请求id
    @NameInMap("user_request_id")
    public String userRequestId;

    public static VerifyBlockchainOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBlockchainOrderRequest self = new VerifyBlockchainOrderRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBlockchainOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyBlockchainOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyBlockchainOrderRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public VerifyBlockchainOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyBlockchainOrderRequest setUserRequestId(String userRequestId) {
        this.userRequestId = userRequestId;
        return this;
    }
    public String getUserRequestId() {
        return this.userRequestId;
    }

}
