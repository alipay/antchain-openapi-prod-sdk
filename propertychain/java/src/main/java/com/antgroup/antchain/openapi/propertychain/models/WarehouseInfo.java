// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class WarehouseInfo extends TeaModel {
    // 地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 平面图
    @NameInMap("blueprint_url")
    @Validation(required = true)
    public String blueprintUrl;

    // 所在国家
    @NameInMap("country")
    @Validation(required = true)
    public String country;

    // 设备数量
    @NameInMap("device_num")
    @Validation(required = true)
    public Long deviceNum;

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

    // 智能版本
    @NameInMap("smart_level")
    @Validation(required = true)
    public String smartLevel;

    // 仓库状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 仓位数量
    @NameInMap("stock_position_num")
    @Validation(required = true)
    public Long stockPositionNum;

    // 版本信息
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 仓库面积
    @NameInMap("warehouse_area")
    @Validation(required = true)
    public String warehouseArea;

    // 仓库高度
    @NameInMap("warehouse_height")
    @Validation(required = true)
    public String warehouseHeight;

    // 仓库Id
    @NameInMap("warehouse_id")
    @Validation(required = true)
    public String warehouseId;

    // 仓库名称
    @NameInMap("warehouse_name")
    @Validation(required = true)
    public String warehouseName;

    public static WarehouseInfo build(java.util.Map<String, ?> map) throws Exception {
        WarehouseInfo self = new WarehouseInfo();
        return TeaModel.build(map, self);
    }

    public WarehouseInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public WarehouseInfo setBlueprintUrl(String blueprintUrl) {
        this.blueprintUrl = blueprintUrl;
        return this;
    }
    public String getBlueprintUrl() {
        return this.blueprintUrl;
    }

    public WarehouseInfo setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public WarehouseInfo setDeviceNum(Long deviceNum) {
        this.deviceNum = deviceNum;
        return this;
    }
    public Long getDeviceNum() {
        return this.deviceNum;
    }

    public WarehouseInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public WarehouseInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public WarehouseInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public WarehouseInfo setSmartLevel(String smartLevel) {
        this.smartLevel = smartLevel;
        return this;
    }
    public String getSmartLevel() {
        return this.smartLevel;
    }

    public WarehouseInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WarehouseInfo setStockPositionNum(Long stockPositionNum) {
        this.stockPositionNum = stockPositionNum;
        return this;
    }
    public Long getStockPositionNum() {
        return this.stockPositionNum;
    }

    public WarehouseInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public WarehouseInfo setWarehouseArea(String warehouseArea) {
        this.warehouseArea = warehouseArea;
        return this;
    }
    public String getWarehouseArea() {
        return this.warehouseArea;
    }

    public WarehouseInfo setWarehouseHeight(String warehouseHeight) {
        this.warehouseHeight = warehouseHeight;
        return this;
    }
    public String getWarehouseHeight() {
        return this.warehouseHeight;
    }

    public WarehouseInfo setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public WarehouseInfo setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

}
