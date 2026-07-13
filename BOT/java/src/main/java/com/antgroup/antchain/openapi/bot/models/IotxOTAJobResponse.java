// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxOTAJobResponse extends TeaModel {
    // 批次id
    /**
     * <strong>example:</strong>
     * <p>2c692f39bbaf43b08590d6daede5895f</p>
     */
    @NameInMap("job_id")
    public String jobId;

    // 任务状态：PLANNED：计划中；IN_PROGRESS：执行中；COMPLETED：已完成；CANCELED：已取消；
    /**
     * <strong>example:</strong>
     * <p>PLANNED</p>
     */
    @NameInMap("job_status")
    public String jobStatus;

    // 任务类型：VERIFY：升级包验证批次。 STATIC_UPGRADE：批量升级批次。
    /**
     * <strong>example:</strong>
     * <p>STATIC_UPGRADE</p>
     */
    @NameInMap("job_type")
    public String jobType;

    // 产品唯一标识
    /**
     * <strong>example:</strong>
     * <p>FuPsO4bwFbyLSrQIiL</p>
     */
    @NameInMap("trust_oroduct_key")
    public String trustOroductKey;

    // OTA固件包ID
    /**
     * <strong>example:</strong>
     * <p>563785f86a6144e2838b3bd1f077f652</p>
     */
    @NameInMap("firmware_id")
    public String firmwareId;

    // 升级目标版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("dest_version")
    public String destVersion;

    // 下载协议
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("download_protocol")
    public String downloadProtocol;

    // 升级批次描述
    /**
     * <strong>example:</strong>
     * <p>升级批次描述</p>
     */
    @NameInMap("job_desc")
    public String jobDesc;

    // 升级策略：VERIFY、STATIC
    /**
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("selection_type")
    public String selectionType;

    // 升级范围 ALL：全量升级、SPECIFIC：定向升级
    /**
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("target_selection")
    public String targetSelection;

    // 待升级版本号列表
    @NameInMap("src_version")
    public java.util.List<String> srcVersion;

    // 升级失败后自动重试间隔：0：立即重试、10：10分钟后重试、30：30分钟后重试、60：60分钟（即1小时）后重试、1440：1,440分钟（即24小时）后重试。不传入此参数，则表示不重试。
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("retry_interval")
    public Long retryInterval;

    // 自动重试次数：1：1次、2：2次、5：5次。如果传入RetryInterval参数，则需传入该参数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("retry_count")
    public Long retryCount;

    // 升级超时时间：0-1440
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("timeout_in_minutes")
    public Long timeoutInMinutes;

    // 定向升级的设备名称列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("target_device_name")
    public java.util.List<String> targetDeviceName;

    // 是否需App确认升级
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_confirm")
    public Boolean needConfirm;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1783948258716</p>
     */
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>1783948258716</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 批次实际执行通道：TUYA_4G、EKYT_BLE
    /**
     * <strong>example:</strong>
     * <p>TUYA_4G</p>
     */
    @NameInMap("channel")
    public String channel;

    // 同设备同模块覆盖策略
    /**
     * <strong>example:</strong>
     * <p>OVERRIDE</p>
     */
    @NameInMap("override_mode")
    public String overrideMode;

    // 多模块并发策略
    /**
     * <strong>example:</strong>
     * <p>ALLOW</p>
     */
    @NameInMap("multi_module_mode")
    public String multiModuleMode;

    // 批次升级方式
    /**
     * <strong>example:</strong>
     * <p>REMIND</p>
     */
    @NameInMap("upgrade_mode")
    public String upgradeMode;

    public static IotxOTAJobResponse build(java.util.Map<String, ?> map) throws Exception {
        IotxOTAJobResponse self = new IotxOTAJobResponse();
        return TeaModel.build(map, self);
    }

    public IotxOTAJobResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public IotxOTAJobResponse setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public IotxOTAJobResponse setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public IotxOTAJobResponse setTrustOroductKey(String trustOroductKey) {
        this.trustOroductKey = trustOroductKey;
        return this;
    }
    public String getTrustOroductKey() {
        return this.trustOroductKey;
    }

    public IotxOTAJobResponse setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public IotxOTAJobResponse setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public IotxOTAJobResponse setDownloadProtocol(String downloadProtocol) {
        this.downloadProtocol = downloadProtocol;
        return this;
    }
    public String getDownloadProtocol() {
        return this.downloadProtocol;
    }

    public IotxOTAJobResponse setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
        return this;
    }
    public String getJobDesc() {
        return this.jobDesc;
    }

    public IotxOTAJobResponse setSelectionType(String selectionType) {
        this.selectionType = selectionType;
        return this;
    }
    public String getSelectionType() {
        return this.selectionType;
    }

    public IotxOTAJobResponse setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }
    public String getTargetSelection() {
        return this.targetSelection;
    }

    public IotxOTAJobResponse setSrcVersion(java.util.List<String> srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public java.util.List<String> getSrcVersion() {
        return this.srcVersion;
    }

    public IotxOTAJobResponse setRetryInterval(Long retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    public IotxOTAJobResponse setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Long getRetryCount() {
        return this.retryCount;
    }

    public IotxOTAJobResponse setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public IotxOTAJobResponse setTargetDeviceName(java.util.List<String> targetDeviceName) {
        this.targetDeviceName = targetDeviceName;
        return this;
    }
    public java.util.List<String> getTargetDeviceName() {
        return this.targetDeviceName;
    }

    public IotxOTAJobResponse setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public IotxOTAJobResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public IotxOTAJobResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public IotxOTAJobResponse setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public IotxOTAJobResponse setOverrideMode(String overrideMode) {
        this.overrideMode = overrideMode;
        return this;
    }
    public String getOverrideMode() {
        return this.overrideMode;
    }

    public IotxOTAJobResponse setMultiModuleMode(String multiModuleMode) {
        this.multiModuleMode = multiModuleMode;
        return this;
    }
    public String getMultiModuleMode() {
        return this.multiModuleMode;
    }

    public IotxOTAJobResponse setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

}
