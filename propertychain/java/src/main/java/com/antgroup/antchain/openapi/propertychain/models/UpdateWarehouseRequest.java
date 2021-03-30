// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateWarehouseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 地址（传原值，不可修改此项）
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 平面图
    @NameInMap("blueprint_id")
    public String blueprintId;

    // 所在国家（传原值，不可修改此项）
    @NameInMap("country")
    @Validation(required = true)
    public String country;

    // 其他信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 仓库面积
    @NameInMap("warehouse_area")
    @Validation(required = true)
    public String warehouseArea;

    // 仓库id
    @NameInMap("warehouse_id")
    @Validation(required = true)
    public String warehouseId;

    // 仓库名称（传原值，不可修改此项）
    @NameInMap("warehouse_name")
    @Validation(required = true)
    public String warehouseName;

    public static UpdateWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarehouseRequest self = new UpdateWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWarehouseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateWarehouseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateWarehouseRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateWarehouseRequest setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
        return this;
    }
    public String getBlueprintId() {
        return this.blueprintId;
    }

    public UpdateWarehouseRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdateWarehouseRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateWarehouseRequest setWarehouseArea(String warehouseArea) {
        this.warehouseArea = warehouseArea;
        return this;
    }
    public String getWarehouseArea() {
        return this.warehouseArea;
    }

    public UpdateWarehouseRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public UpdateWarehouseRequest setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

}
