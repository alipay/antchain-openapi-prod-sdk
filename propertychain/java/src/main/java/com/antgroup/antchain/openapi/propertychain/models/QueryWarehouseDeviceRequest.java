// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryWarehouseDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备状态[READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销，ALL：全部]
    @NameInMap("device_filter")
    public String deviceFilter;

    // 仓位id
    @NameInMap("storage_location_id")
    public String storageLocationId;

    // 仓库id
    @NameInMap("warehouse_id")
    @Validation(required = true)
    public String warehouseId;

    public static QueryWarehouseDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWarehouseDeviceRequest self = new QueryWarehouseDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryWarehouseDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWarehouseDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWarehouseDeviceRequest setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
        return this;
    }
    public String getDeviceFilter() {
        return this.deviceFilter;
    }

    public QueryWarehouseDeviceRequest setStorageLocationId(String storageLocationId) {
        this.storageLocationId = storageLocationId;
        return this;
    }
    public String getStorageLocationId() {
        return this.storageLocationId;
    }

    public QueryWarehouseDeviceRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

}
