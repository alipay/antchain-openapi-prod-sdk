// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateWarehouseResponse extends TeaModel {
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
    @NameInMap("blueprint_id")
    public String blueprintId;

    // 所在国家
    @NameInMap("country")
    public String country;

    // 其他信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 经纬度
    @NameInMap("location")
    public String location;

    // 仓库面积
    @NameInMap("warehouse_area")
    public String warehouseArea;

    // 仓库id
    @NameInMap("warehouse_id")
    public String warehouseId;

    // 仓库名称
    @NameInMap("warehouse_name")
    public String warehouseName;

    public static UpdateWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarehouseResponse self = new UpdateWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWarehouseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateWarehouseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateWarehouseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateWarehouseResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateWarehouseResponse setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
        return this;
    }
    public String getBlueprintId() {
        return this.blueprintId;
    }

    public UpdateWarehouseResponse setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdateWarehouseResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateWarehouseResponse setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateWarehouseResponse setWarehouseArea(String warehouseArea) {
        this.warehouseArea = warehouseArea;
        return this;
    }
    public String getWarehouseArea() {
        return this.warehouseArea;
    }

    public UpdateWarehouseResponse setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public UpdateWarehouseResponse setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

}
