// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class TransactionInInfo extends TeaModel {
    // 入库信息表ID
    @NameInMap("id")
    public Long id;

    // 仓库Did
    @NameInMap("warehouse_did")
    public String warehouseDid;

    // 仓库名称
    @NameInMap("warehouse_name")
    public String warehouseName;

    // 库位Did
    @NameInMap("location_did")
    public String locationDid;

    // 库位名称
    @NameInMap("location_name")
    public String locationName;

    // 设备Did
    @NameInMap("device_did")
    public String deviceDid;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    // 开始时间，单位：s
    @NameInMap("start_time")
    public Long startTime;

    // 结束时间, 单位：s
    @NameInMap("end_time")
    public Long endTime;

    // 入库视频信息url
    @NameInMap("video_url")
    public String videoUrl;

    // 存证交易hash
    @NameInMap("tx_hash")
    public String txHash;

    public static TransactionInInfo build(java.util.Map<String, ?> map) throws Exception {
        TransactionInInfo self = new TransactionInInfo();
        return TeaModel.build(map, self);
    }

    public TransactionInInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TransactionInInfo setWarehouseDid(String warehouseDid) {
        this.warehouseDid = warehouseDid;
        return this;
    }
    public String getWarehouseDid() {
        return this.warehouseDid;
    }

    public TransactionInInfo setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

    public TransactionInInfo setLocationDid(String locationDid) {
        this.locationDid = locationDid;
        return this;
    }
    public String getLocationDid() {
        return this.locationDid;
    }

    public TransactionInInfo setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public TransactionInInfo setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public TransactionInInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public TransactionInInfo setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public TransactionInInfo setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public TransactionInInfo setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public TransactionInInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
