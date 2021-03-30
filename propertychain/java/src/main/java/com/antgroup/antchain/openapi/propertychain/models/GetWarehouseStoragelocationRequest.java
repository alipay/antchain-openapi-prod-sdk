// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class GetWarehouseStoragelocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 库位id
    @NameInMap("location_id")
    @Validation(required = true)
    public String locationId;

    public static GetWarehouseStoragelocationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWarehouseStoragelocationRequest self = new GetWarehouseStoragelocationRequest();
        return TeaModel.build(map, self);
    }

    public GetWarehouseStoragelocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetWarehouseStoragelocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetWarehouseStoragelocationRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

}
