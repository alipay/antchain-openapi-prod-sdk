// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class GetWarehouseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 仓库id
    @NameInMap("warehouse_id")
    @Validation(required = true)
    public String warehouseId;

    public static GetWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWarehouseRequest self = new GetWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public GetWarehouseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetWarehouseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetWarehouseRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

}
