// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UnfinishedUpgradeTaskVO extends TeaModel {
    // OTA 任务所属通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
    /**
     * <strong>example:</strong>
     * <p>TUYA_4G</p>
     */
    @NameInMap("channel")
    public String channel;

    // OTA 任务 ID
    /**
     * <strong>example:</strong>
     * <p>fc5068e629284b3a8c4424b109583705</p>
     */
    @NameInMap("task_id")
    public String taskId;

    // 任务对应的设备展示标识
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("device_identity")
    public DeviceIdentity deviceIdentity;

    // 任务对应的 OTA 模块定位信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("module_locator")
    public ModuleLocator moduleLocator;

    // 任务源版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("src_version")
    public String srcVersion;

    // 任务目标版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("dest_version")
    public String destVersion;

    // 设备当前模块版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("cur_version")
    public String curVersion;

    // 固件包 ID
    /**
     * <strong>example:</strong>
     * <p>25c3f69752244678a84f663e4d48a56a</p>
     */
    @NameInMap("firmware_id")
    public String firmwareId;

    // OTA 批次 ID
    /**
     * <strong>example:</strong>
     * <p>3a1fd361e7984e15afca3450d9b0df8b</p>
     */
    @NameInMap("job_id")
    public String jobId;

    // 升级提示文案
    /**
     * <strong>example:</strong>
     * <p>升级提示文案</p>
     */
    @NameInMap("upgrade_desc")
    public String upgradeDesc;

    // 升级模式：CHECK -检测升级 / REMIND - 提醒升级/ FORCE - 强制升级
    /**
     * <strong>example:</strong>
     * <p>CHECK</p>
     */
    @NameInMap("upgrade_mode")
    public String upgradeMode;

    // 任务状态：CONFIRM / QUEUED / NOTIFIED / IN_PROGRESS / FAILED / CANCELED 等
    /**
     * <strong>example:</strong>
     * <p>CONFIRM</p>
     */
    @NameInMap("task_status")
    public String taskStatus;

    // 任务创建时间
    /**
     * <strong>example:</strong>
     * <p>1782973123964</p>
     */
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 任务最后更新时间
    /**
     * <strong>example:</strong>
     * <p>1782973123964</p>
     */
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static UnfinishedUpgradeTaskVO build(java.util.Map<String, ?> map) throws Exception {
        UnfinishedUpgradeTaskVO self = new UnfinishedUpgradeTaskVO();
        return TeaModel.build(map, self);
    }

    public UnfinishedUpgradeTaskVO setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UnfinishedUpgradeTaskVO setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UnfinishedUpgradeTaskVO setDeviceIdentity(DeviceIdentity deviceIdentity) {
        this.deviceIdentity = deviceIdentity;
        return this;
    }
    public DeviceIdentity getDeviceIdentity() {
        return this.deviceIdentity;
    }

    public UnfinishedUpgradeTaskVO setModuleLocator(ModuleLocator moduleLocator) {
        this.moduleLocator = moduleLocator;
        return this;
    }
    public ModuleLocator getModuleLocator() {
        return this.moduleLocator;
    }

    public UnfinishedUpgradeTaskVO setSrcVersion(String srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public String getSrcVersion() {
        return this.srcVersion;
    }

    public UnfinishedUpgradeTaskVO setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public UnfinishedUpgradeTaskVO setCurVersion(String curVersion) {
        this.curVersion = curVersion;
        return this;
    }
    public String getCurVersion() {
        return this.curVersion;
    }

    public UnfinishedUpgradeTaskVO setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public UnfinishedUpgradeTaskVO setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UnfinishedUpgradeTaskVO setUpgradeDesc(String upgradeDesc) {
        this.upgradeDesc = upgradeDesc;
        return this;
    }
    public String getUpgradeDesc() {
        return this.upgradeDesc;
    }

    public UnfinishedUpgradeTaskVO setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    public UnfinishedUpgradeTaskVO setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public UnfinishedUpgradeTaskVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public UnfinishedUpgradeTaskVO setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
