// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtataskpageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 可信物联产品唯一标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // OTA任务id
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    // OTA固件id
    @NameInMap("firmware_id")
    @Validation(required = true)
    public String firmwareId;

    // 任务状态：CONFIRM, QUEUED, NOTIFIED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
    @NameInMap("task_status")
    public String taskStatus;

    // 设备名称列表
    @NameInMap("device_names")
    public java.util.List<String> deviceNames;

    public static QueryElectrocarOtataskpageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtataskpageRequest self = new QueryElectrocarOtataskpageRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtataskpageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarOtataskpageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarOtataskpageRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryElectrocarOtataskpageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarOtataskpageRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarOtataskpageRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryElectrocarOtataskpageRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public QueryElectrocarOtataskpageRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public QueryElectrocarOtataskpageRequest setDeviceNames(java.util.List<String> deviceNames) {
        this.deviceNames = deviceNames;
        return this;
    }
    public java.util.List<String> getDeviceNames() {
        return this.deviceNames;
    }

}
