// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class PushChargeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户
    @NameInMap("biz_tenant")
    @Validation(required = true)
    public String bizTenant;

    // 平台分发,子业务类型，对应原来的authType.
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 系统编码,平台分发，定义枚举，全局用
    @NameInMap("system_code")
    @Validation(required = true)
    public String systemCode;

    // 请求id
    @NameInMap("task_request_id")
    @Validation(required = true)
    public String taskRequestId;

    public static PushChargeRequest build(java.util.Map<String, ?> map) throws Exception {
        PushChargeRequest self = new PushChargeRequest();
        return TeaModel.build(map, self);
    }

    public PushChargeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushChargeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushChargeRequest setBizTenant(String bizTenant) {
        this.bizTenant = bizTenant;
        return this;
    }
    public String getBizTenant() {
        return this.bizTenant;
    }

    public PushChargeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PushChargeRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public PushChargeRequest setSystemCode(String systemCode) {
        this.systemCode = systemCode;
        return this;
    }
    public String getSystemCode() {
        return this.systemCode;
    }

    public PushChargeRequest setTaskRequestId(String taskRequestId) {
        this.taskRequestId = taskRequestId;
        return this;
    }
    public String getTaskRequestId() {
        return this.taskRequestId;
    }

}
