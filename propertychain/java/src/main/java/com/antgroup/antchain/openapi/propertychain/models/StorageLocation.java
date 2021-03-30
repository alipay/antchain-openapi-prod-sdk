// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class StorageLocation extends TeaModel {
    // 仓位容量
    @NameInMap("capacity")
    public String capacity;

    // 设备id
    @NameInMap("device_id_list")
    public java.util.List<String> deviceIdList;

    // 其他信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 库位id
    @NameInMap("id")
    public String id;

    // 监控等级【VIDEOREGULATORY：视频监控】
    @NameInMap("monitor_capacity")
    public String monitorCapacity;

    // 监控水平【STANDARD：标准版，UPGRADED：升级版】
    @NameInMap("monitor_level")
    public String monitorLevel;

    // 库位名称
    @NameInMap("name")
    public String name;

    // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】	
    // 
    @NameInMap("product_type")
    public String productType;

    // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
    @NameInMap("status")
    public String status;

    // 仓位面积
    @NameInMap("storage_location_area")
    public String storageLocationArea;

    // 仓位高度
    @NameInMap("storage_location_height")
    public String storageLocationHeight;

    // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
    @NameInMap("type")
    public String type;

    // 已用容量
    @NameInMap("used_capacity")
    public String usedCapacity;

    // 库位虚拟id
    @NameInMap("virtual_id")
    public String virtualId;

    // 仓库Id
    @NameInMap("warehouse_id")
    public String warehouseId;

    // 关联仓单Id
    @NameInMap("warehouse_receipt_id")
    public String warehouseReceiptId;

    public static StorageLocation build(java.util.Map<String, ?> map) throws Exception {
        StorageLocation self = new StorageLocation();
        return TeaModel.build(map, self);
    }

    public StorageLocation setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public StorageLocation setDeviceIdList(java.util.List<String> deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public java.util.List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

    public StorageLocation setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public StorageLocation setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StorageLocation setMonitorCapacity(String monitorCapacity) {
        this.monitorCapacity = monitorCapacity;
        return this;
    }
    public String getMonitorCapacity() {
        return this.monitorCapacity;
    }

    public StorageLocation setMonitorLevel(String monitorLevel) {
        this.monitorLevel = monitorLevel;
        return this;
    }
    public String getMonitorLevel() {
        return this.monitorLevel;
    }

    public StorageLocation setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StorageLocation setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public StorageLocation setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StorageLocation setStorageLocationArea(String storageLocationArea) {
        this.storageLocationArea = storageLocationArea;
        return this;
    }
    public String getStorageLocationArea() {
        return this.storageLocationArea;
    }

    public StorageLocation setStorageLocationHeight(String storageLocationHeight) {
        this.storageLocationHeight = storageLocationHeight;
        return this;
    }
    public String getStorageLocationHeight() {
        return this.storageLocationHeight;
    }

    public StorageLocation setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public StorageLocation setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }
    public String getUsedCapacity() {
        return this.usedCapacity;
    }

    public StorageLocation setVirtualId(String virtualId) {
        this.virtualId = virtualId;
        return this;
    }
    public String getVirtualId() {
        return this.virtualId;
    }

    public StorageLocation setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public StorageLocation setWarehouseReceiptId(String warehouseReceiptId) {
        this.warehouseReceiptId = warehouseReceiptId;
        return this;
    }
    public String getWarehouseReceiptId() {
        return this.warehouseReceiptId;
    }

}
