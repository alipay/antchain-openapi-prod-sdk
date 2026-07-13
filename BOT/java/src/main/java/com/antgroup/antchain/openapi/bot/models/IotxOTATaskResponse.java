// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxOTATaskResponse extends TeaModel {
    // 任务ID
    /**
     * <strong>example:</strong>
     * <p>785c56486ff14f72aa53c0aff20b1760</p>
     */
    @NameInMap("task_id")
    public String taskId;

    // 设备名称
    /**
     * <strong>example:</strong>
     * <p>FF9999995FF10202603252F71EC54393</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    // OTA批次ID
    /**
     * <strong>example:</strong>
     * <p>cef4fc962ee7456985d011d30d3f448f</p>
     */
    @NameInMap("job_id")
    public String jobId;

    // 固件ID
    /**
     * <strong>example:</strong>
     * <p>84a1f449422946d2a4e87c1c23503f6b</p>
     */
    @NameInMap("firmware_id")
    public String firmwareId;

    // 可信物联唯一产品标识
    /**
     * <strong>example:</strong>
     * <p>A7njznJkBrCCDdeIKl</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>产品名称</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 源版本
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("src_version")
    public String srcVersion;

    // 目标版本
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("dest_version")
    public String destVersion;

    // 任务状态：CONFIRM, QUEUED, NOTIFIED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
    /**
     * <strong>example:</strong>
     * <p>CONFIRM</p>
     */
    @NameInMap("task_status")
    public String taskStatus;

    // 升级进度
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("progress")
    public String progress;

    // 任务描述
    /**
     * <strong>example:</strong>
     * <p>任务描述</p>
     */
    @NameInMap("task_desc")
    public String taskDesc;

    // 超时时间
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("timeout")
    public String timeout;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1783948258774</p>
     */
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>1783948258774</p>
     */
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static IotxOTATaskResponse build(java.util.Map<String, ?> map) throws Exception {
        IotxOTATaskResponse self = new IotxOTATaskResponse();
        return TeaModel.build(map, self);
    }

    public IotxOTATaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public IotxOTATaskResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IotxOTATaskResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public IotxOTATaskResponse setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public IotxOTATaskResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public IotxOTATaskResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public IotxOTATaskResponse setSrcVersion(String srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public String getSrcVersion() {
        return this.srcVersion;
    }

    public IotxOTATaskResponse setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public IotxOTATaskResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public IotxOTATaskResponse setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public IotxOTATaskResponse setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }
    public String getTaskDesc() {
        return this.taskDesc;
    }

    public IotxOTATaskResponse setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public IotxOTATaskResponse setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public IotxOTATaskResponse setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
