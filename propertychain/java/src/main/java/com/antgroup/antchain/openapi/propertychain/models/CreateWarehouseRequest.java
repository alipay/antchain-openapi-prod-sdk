// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateWarehouseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 平面图
    @NameInMap("blueprint_id")
    public String blueprintId;

    // 所在国家
    @NameInMap("country")
    @Validation(required = true)
    public String country;

    // 其他信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 纬度
    @NameInMap("latitude")
    @Validation(required = true)
    public String latitude;

    // 经度
    @NameInMap("longitude")
    @Validation(required = true)
    public String longitude;

    // 仓库面积
    @NameInMap("warehouse_area")
    @Validation(required = true)
    public String warehouseArea;

    // 仓库高度
    @NameInMap("warehouse_height")
    public String warehouseHeight;

    // 仓库id
    @NameInMap("warehouse_id")
    @Validation(required = true, maxLength = 255, minLength = 1)
    public String warehouseId;

    // 仓库名称
    @NameInMap("warehouse_name")
    @Validation(required = true, maxLength = 255, minLength = 1)
    public String warehouseName;

    public static CreateWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseRequest self = new CreateWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWarehouseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWarehouseRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateWarehouseRequest setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
        return this;
    }
    public String getBlueprintId() {
        return this.blueprintId;
    }

    public CreateWarehouseRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateWarehouseRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateWarehouseRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public CreateWarehouseRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public CreateWarehouseRequest setWarehouseArea(String warehouseArea) {
        this.warehouseArea = warehouseArea;
        return this;
    }
    public String getWarehouseArea() {
        return this.warehouseArea;
    }

    public CreateWarehouseRequest setWarehouseHeight(String warehouseHeight) {
        this.warehouseHeight = warehouseHeight;
        return this;
    }
    public String getWarehouseHeight() {
        return this.warehouseHeight;
    }

    public CreateWarehouseRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public CreateWarehouseRequest setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

}
