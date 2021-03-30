// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class DeleteWarehouseStoragelocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 仓位id
    @NameInMap("location_id")
    @Validation(required = true)
    public String locationId;

    // 仓库id
    @NameInMap("warehouse_id")
    @Validation(required = true)
    public String warehouseId;

    public static DeleteWarehouseStoragelocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarehouseStoragelocationRequest self = new DeleteWarehouseStoragelocationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWarehouseStoragelocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteWarehouseStoragelocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteWarehouseStoragelocationRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public DeleteWarehouseStoragelocationRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

}
