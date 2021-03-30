// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class DeviceInfoNoGroup extends TeaModel {
    // 物模型Id
    @NameInMap("aliyun_model_id")
    public String aliyunModelId;

    // 三元组
    @NameInMap("device_meta")
    public String deviceMeta;

    // 设备拥有者Id
    @NameInMap("device_owner_id")
    public String deviceOwnerId;

    // 设备安装信息
    @NameInMap("device_setup_info")
    public String deviceSetupInfo;

    // 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
    // 
    @NameInMap("device_type")
    public String deviceType;

    // 设备使用者Id
    @NameInMap("device_user_id_list")
    public java.util.List<String> deviceUserIdList;

    // 设备虚拟id
    @NameInMap("device_virtual_id")
    public String deviceVirtualId;

    // 智能版本
    @NameInMap("smart_version")
    public String smartVersion;

    // 设备状态 【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
    @NameInMap("status")
    public String status;

    // 库位Id
    @NameInMap("stock_position_id_list")
    public java.util.List<String> stockPositionIdList;

    // 库位名称
    @NameInMap("stock_position_name_list")
    public java.util.List<String> stockPositionNameList;

    // 设备id
    @NameInMap("things_did")
    public String thingsDid;

    // 设备名称
    @NameInMap("things_name")
    public String thingsName;

    // 视频流地址
    @NameInMap("video_url")
    public String videoUrl;

    // 仓库Id
    @NameInMap("warehouse_id")
    public String warehouseId;

    // 仓库名称
    @NameInMap("warehouse_name")
    public String warehouseName;

    public static DeviceInfoNoGroup build(java.util.Map<String, ?> map) throws Exception {
        DeviceInfoNoGroup self = new DeviceInfoNoGroup();
        return TeaModel.build(map, self);
    }

    public DeviceInfoNoGroup setAliyunModelId(String aliyunModelId) {
        this.aliyunModelId = aliyunModelId;
        return this;
    }
    public String getAliyunModelId() {
        return this.aliyunModelId;
    }

    public DeviceInfoNoGroup setDeviceMeta(String deviceMeta) {
        this.deviceMeta = deviceMeta;
        return this;
    }
    public String getDeviceMeta() {
        return this.deviceMeta;
    }

    public DeviceInfoNoGroup setDeviceOwnerId(String deviceOwnerId) {
        this.deviceOwnerId = deviceOwnerId;
        return this;
    }
    public String getDeviceOwnerId() {
        return this.deviceOwnerId;
    }

    public DeviceInfoNoGroup setDeviceSetupInfo(String deviceSetupInfo) {
        this.deviceSetupInfo = deviceSetupInfo;
        return this;
    }
    public String getDeviceSetupInfo() {
        return this.deviceSetupInfo;
    }

    public DeviceInfoNoGroup setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public DeviceInfoNoGroup setDeviceUserIdList(java.util.List<String> deviceUserIdList) {
        this.deviceUserIdList = deviceUserIdList;
        return this;
    }
    public java.util.List<String> getDeviceUserIdList() {
        return this.deviceUserIdList;
    }

    public DeviceInfoNoGroup setDeviceVirtualId(String deviceVirtualId) {
        this.deviceVirtualId = deviceVirtualId;
        return this;
    }
    public String getDeviceVirtualId() {
        return this.deviceVirtualId;
    }

    public DeviceInfoNoGroup setSmartVersion(String smartVersion) {
        this.smartVersion = smartVersion;
        return this;
    }
    public String getSmartVersion() {
        return this.smartVersion;
    }

    public DeviceInfoNoGroup setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeviceInfoNoGroup setStockPositionIdList(java.util.List<String> stockPositionIdList) {
        this.stockPositionIdList = stockPositionIdList;
        return this;
    }
    public java.util.List<String> getStockPositionIdList() {
        return this.stockPositionIdList;
    }

    public DeviceInfoNoGroup setStockPositionNameList(java.util.List<String> stockPositionNameList) {
        this.stockPositionNameList = stockPositionNameList;
        return this;
    }
    public java.util.List<String> getStockPositionNameList() {
        return this.stockPositionNameList;
    }

    public DeviceInfoNoGroup setThingsDid(String thingsDid) {
        this.thingsDid = thingsDid;
        return this;
    }
    public String getThingsDid() {
        return this.thingsDid;
    }

    public DeviceInfoNoGroup setThingsName(String thingsName) {
        this.thingsName = thingsName;
        return this;
    }
    public String getThingsName() {
        return this.thingsName;
    }

    public DeviceInfoNoGroup setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public DeviceInfoNoGroup setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public DeviceInfoNoGroup setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

}
