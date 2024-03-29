// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ScfLeaseEqpInfo extends TeaModel {
    // 设备类型
    @NameInMap("device_type")
    public String deviceType;

    // 运营日期
    @NameInMap("operation_date")
    public String operationDate;

    // 修改时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // 维修金比例
    @NameInMap("maintenance_money")
    public String maintenanceMoney;

    // 当日设备维修记录
    @NameInMap("maintain_record")
    public String maintainRecord;

    // 设备识别号
    @NameInMap("device_no")
    public String deviceNo;

    // 创建时间
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 当日分拣单数
    @NameInMap("sorting_num")
    public String sortingNum;

    // 当日运营时长,单位分钟
    @NameInMap("operation_minute")
    public String operationMinute;

    // 04:00-16:00分拣单数/（派件分拣单数）
    @NameInMap("am_num")
    public String amNum;

    // 16:00-04:00分拣单数/ （揽件分拣单数)
    @NameInMap("pm_num")
    public String pmNum;

    // id
    @NameInMap("id")
    public String id;

    // 设备验收日期
    @NameInMap("device_acceptance_date")
    public String deviceAcceptanceDate;

    // 数据更新时间
    @NameInMap("data_update_time")
    public String dataUpdateTime;

    public static ScfLeaseEqpInfo build(java.util.Map<String, ?> map) throws Exception {
        ScfLeaseEqpInfo self = new ScfLeaseEqpInfo();
        return TeaModel.build(map, self);
    }

    public ScfLeaseEqpInfo setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ScfLeaseEqpInfo setOperationDate(String operationDate) {
        this.operationDate = operationDate;
        return this;
    }
    public String getOperationDate() {
        return this.operationDate;
    }

    public ScfLeaseEqpInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ScfLeaseEqpInfo setMaintenanceMoney(String maintenanceMoney) {
        this.maintenanceMoney = maintenanceMoney;
        return this;
    }
    public String getMaintenanceMoney() {
        return this.maintenanceMoney;
    }

    public ScfLeaseEqpInfo setMaintainRecord(String maintainRecord) {
        this.maintainRecord = maintainRecord;
        return this;
    }
    public String getMaintainRecord() {
        return this.maintainRecord;
    }

    public ScfLeaseEqpInfo setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
        return this;
    }
    public String getDeviceNo() {
        return this.deviceNo;
    }

    public ScfLeaseEqpInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ScfLeaseEqpInfo setSortingNum(String sortingNum) {
        this.sortingNum = sortingNum;
        return this;
    }
    public String getSortingNum() {
        return this.sortingNum;
    }

    public ScfLeaseEqpInfo setOperationMinute(String operationMinute) {
        this.operationMinute = operationMinute;
        return this;
    }
    public String getOperationMinute() {
        return this.operationMinute;
    }

    public ScfLeaseEqpInfo setAmNum(String amNum) {
        this.amNum = amNum;
        return this;
    }
    public String getAmNum() {
        return this.amNum;
    }

    public ScfLeaseEqpInfo setPmNum(String pmNum) {
        this.pmNum = pmNum;
        return this;
    }
    public String getPmNum() {
        return this.pmNum;
    }

    public ScfLeaseEqpInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ScfLeaseEqpInfo setDeviceAcceptanceDate(String deviceAcceptanceDate) {
        this.deviceAcceptanceDate = deviceAcceptanceDate;
        return this;
    }
    public String getDeviceAcceptanceDate() {
        return this.deviceAcceptanceDate;
    }

    public ScfLeaseEqpInfo setDataUpdateTime(String dataUpdateTime) {
        this.dataUpdateTime = dataUpdateTime;
        return this;
    }
    public String getDataUpdateTime() {
        return this.dataUpdateTime;
    }

}
