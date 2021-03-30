// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class GetWarehouseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 地址
    @NameInMap("address")
    public String address;

    // 平面图
    @NameInMap("blueprint_url")
    public String blueprintUrl;

    // 所在国家
    @NameInMap("country")
    public String country;

    // 设备数量
    @NameInMap("device_num")
    public Long deviceNum;

    // 其他信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 纬度
    @NameInMap("latitude")
    public String latitude;

    // 经度
    @NameInMap("longitude")
    public String longitude;

    // 智能版本
    @NameInMap("smart_level")
    public String smartLevel;

    // 仓位数量
    @NameInMap("stock_position_num")
    public Long stockPositionNum;

    // version
    @NameInMap("version")
    public String version;

    // 仓库面积
    @NameInMap("warehouse_area")
    public String warehouseArea;

    // 仓库高度
    @NameInMap("warehouse_height")
    public String warehouseHeight;

    // 仓库id
    @NameInMap("warehouse_id")
    public String warehouseId;

    // 仓库名称
    @NameInMap("warehouse_name")
    public String warehouseName;

    public static GetWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWarehouseResponse self = new GetWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public GetWarehouseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetWarehouseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetWarehouseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetWarehouseResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public GetWarehouseResponse setBlueprintUrl(String blueprintUrl) {
        this.blueprintUrl = blueprintUrl;
        return this;
    }
    public String getBlueprintUrl() {
        return this.blueprintUrl;
    }

    public GetWarehouseResponse setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public GetWarehouseResponse setDeviceNum(Long deviceNum) {
        this.deviceNum = deviceNum;
        return this;
    }
    public Long getDeviceNum() {
        return this.deviceNum;
    }

    public GetWarehouseResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GetWarehouseResponse setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public GetWarehouseResponse setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public GetWarehouseResponse setSmartLevel(String smartLevel) {
        this.smartLevel = smartLevel;
        return this;
    }
    public String getSmartLevel() {
        return this.smartLevel;
    }

    public GetWarehouseResponse setStockPositionNum(Long stockPositionNum) {
        this.stockPositionNum = stockPositionNum;
        return this;
    }
    public Long getStockPositionNum() {
        return this.stockPositionNum;
    }

    public GetWarehouseResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetWarehouseResponse setWarehouseArea(String warehouseArea) {
        this.warehouseArea = warehouseArea;
        return this;
    }
    public String getWarehouseArea() {
        return this.warehouseArea;
    }

    public GetWarehouseResponse setWarehouseHeight(String warehouseHeight) {
        this.warehouseHeight = warehouseHeight;
        return this;
    }
    public String getWarehouseHeight() {
        return this.warehouseHeight;
    }

    public GetWarehouseResponse setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public GetWarehouseResponse setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

}
