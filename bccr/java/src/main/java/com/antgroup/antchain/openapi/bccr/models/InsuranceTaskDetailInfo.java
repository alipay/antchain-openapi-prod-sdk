// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class InsuranceTaskDetailInfo extends TeaModel {
    // 用户备注
    @NameInMap("user_memo")
    public String userMemo;

    // 上门人员姓名
    @NameInMap("door_to_door_worker_name")
    public String doorToDoorWorkerName;

    // 电池包装码
    @NameInMap("battery_packaging_code")
    public String batteryPackagingCode;

    // 电池码
    @NameInMap("battery_code")
    public String batteryCode;

    // 图片列表
    @NameInMap("install_images")
    public java.util.List<String> installImages;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 任务状态
    @NameInMap("task_status")
    @Validation(required = true)
    public String taskStatus;

    // 电池型号
    @NameInMap("battery_type")
    @Validation(required = true)
    public String batteryType;

    // 上门地址
    @NameInMap("service_address")
    @Validation(required = true)
    public String serviceAddress;

    // 租赁人姓名
    @NameInMap("battery_renter_name")
    @Validation(required = true)
    public String batteryRenterName;

    // 租赁人电话
    @NameInMap("battery_renter_phone")
    @Validation(required = true)
    public String batteryRenterPhone;

    // 上门时间
    @NameInMap("service_time")
    @Validation(required = true)
    public String serviceTime;

    // 任务所属服务商账号id
    @NameInMap("isv_account_id")
    @Validation(required = true)
    public String isvAccountId;

    public static InsuranceTaskDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        InsuranceTaskDetailInfo self = new InsuranceTaskDetailInfo();
        return TeaModel.build(map, self);
    }

    public InsuranceTaskDetailInfo setUserMemo(String userMemo) {
        this.userMemo = userMemo;
        return this;
    }
    public String getUserMemo() {
        return this.userMemo;
    }

    public InsuranceTaskDetailInfo setDoorToDoorWorkerName(String doorToDoorWorkerName) {
        this.doorToDoorWorkerName = doorToDoorWorkerName;
        return this;
    }
    public String getDoorToDoorWorkerName() {
        return this.doorToDoorWorkerName;
    }

    public InsuranceTaskDetailInfo setBatteryPackagingCode(String batteryPackagingCode) {
        this.batteryPackagingCode = batteryPackagingCode;
        return this;
    }
    public String getBatteryPackagingCode() {
        return this.batteryPackagingCode;
    }

    public InsuranceTaskDetailInfo setBatteryCode(String batteryCode) {
        this.batteryCode = batteryCode;
        return this;
    }
    public String getBatteryCode() {
        return this.batteryCode;
    }

    public InsuranceTaskDetailInfo setInstallImages(java.util.List<String> installImages) {
        this.installImages = installImages;
        return this;
    }
    public java.util.List<String> getInstallImages() {
        return this.installImages;
    }

    public InsuranceTaskDetailInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public InsuranceTaskDetailInfo setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public InsuranceTaskDetailInfo setBatteryType(String batteryType) {
        this.batteryType = batteryType;
        return this;
    }
    public String getBatteryType() {
        return this.batteryType;
    }

    public InsuranceTaskDetailInfo setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
        return this;
    }
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public InsuranceTaskDetailInfo setBatteryRenterName(String batteryRenterName) {
        this.batteryRenterName = batteryRenterName;
        return this;
    }
    public String getBatteryRenterName() {
        return this.batteryRenterName;
    }

    public InsuranceTaskDetailInfo setBatteryRenterPhone(String batteryRenterPhone) {
        this.batteryRenterPhone = batteryRenterPhone;
        return this;
    }
    public String getBatteryRenterPhone() {
        return this.batteryRenterPhone;
    }

    public InsuranceTaskDetailInfo setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
        return this;
    }
    public String getServiceTime() {
        return this.serviceTime;
    }

    public InsuranceTaskDetailInfo setIsvAccountId(String isvAccountId) {
        this.isvAccountId = isvAccountId;
        return this;
    }
    public String getIsvAccountId() {
        return this.isvAccountId;
    }

}
