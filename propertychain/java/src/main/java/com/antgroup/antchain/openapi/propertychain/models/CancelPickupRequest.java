// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CancelPickupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提取码
    @NameInMap("pickup_id")
    @Validation(required = true)
    public String pickupId;

    // 用户标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CancelPickupRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPickupRequest self = new CancelPickupRequest();
        return TeaModel.build(map, self);
    }

    public CancelPickupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelPickupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelPickupRequest setPickupId(String pickupId) {
        this.pickupId = pickupId;
        return this;
    }
    public String getPickupId() {
        return this.pickupId;
    }

    public CancelPickupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
