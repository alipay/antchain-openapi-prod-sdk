// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class PushAntdigitalMediasmsOutcallTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上游任务ID，长度不能超过128
    @NameInMap("mass_task_id")
    @Validation(required = true)
    public String massTaskId;

    // 外呼任务编码,长度不能超过128
    @NameInMap("task_code")
    @Validation(required = true)
    public String taskCode;

    // yyyy-MM-dd HH:mm:ss
    @NameInMap("call_time")
    public String callTime;

    // 调度方式（1-异步、2-同步）
    @NameInMap("dispatch_type")
    @Validation(required = true)
    public String dispatchType;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 手机号列表
    @NameInMap("customer_list")
    @Validation(required = true)
    public java.util.List<String> customerList;

    public static PushAntdigitalMediasmsOutcallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntdigitalMediasmsOutcallTaskRequest self = new PushAntdigitalMediasmsOutcallTaskRequest();
        return TeaModel.build(map, self);
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setMassTaskId(String massTaskId) {
        this.massTaskId = massTaskId;
        return this;
    }
    public String getMassTaskId() {
        return this.massTaskId;
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setCallTime(String callTime) {
        this.callTime = callTime;
        return this;
    }
    public String getCallTime() {
        return this.callTime;
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
        return this;
    }
    public String getDispatchType() {
        return this.dispatchType;
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PushAntdigitalMediasmsOutcallTaskRequest setCustomerList(java.util.List<String> customerList) {
        this.customerList = customerList;
        return this;
    }
    public java.util.List<String> getCustomerList() {
        return this.customerList;
    }

}
