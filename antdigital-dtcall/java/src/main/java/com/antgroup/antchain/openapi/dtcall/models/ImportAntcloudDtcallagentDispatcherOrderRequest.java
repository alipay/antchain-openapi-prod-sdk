// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcall.models;

import com.aliyun.tea.*;

public class ImportAntcloudDtcallagentDispatcherOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一 ID，建议全局唯一
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 实例code
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // 外呼任务编码
    @NameInMap("task_code")
    @Validation(required = true)
    public String taskCode;

    // 外呼调度时间，实际拨打时间大于等于该时间，建议格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("call_time")
    @Validation(required = true)
    public String callTime;

    // 失效时间，建议格式：yyyy-MM-dd HH:mm:ss，默认 7 天
    @NameInMap("expiration_time")
    public String expirationTime;

    // 触达用户列表，单次上限 100
    @NameInMap("customer_list")
    @Validation(required = true)
    public java.util.List<Customer> customerList;

    public static ImportAntcloudDtcallagentDispatcherOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAntcloudDtcallagentDispatcherOrderRequest self = new ImportAntcloudDtcallagentDispatcherOrderRequest();
        return TeaModel.build(map, self);
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setCallTime(String callTime) {
        this.callTime = callTime;
        return this;
    }
    public String getCallTime() {
        return this.callTime;
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public String getExpirationTime() {
        return this.expirationTime;
    }

    public ImportAntcloudDtcallagentDispatcherOrderRequest setCustomerList(java.util.List<Customer> customerList) {
        this.customerList = customerList;
        return this;
    }
    public java.util.List<Customer> getCustomerList() {
        return this.customerList;
    }

}
