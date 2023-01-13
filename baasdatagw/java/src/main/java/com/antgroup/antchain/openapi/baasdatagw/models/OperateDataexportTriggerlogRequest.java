// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class OperateDataexportTriggerlogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // biz_id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 导出任务ID
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 操作
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 导出任务日志ID列表
    @NameInMap("logs")
    @Validation(required = true)
    public java.util.List<String> logs;

    public static OperateDataexportTriggerlogRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDataexportTriggerlogRequest self = new OperateDataexportTriggerlogRequest();
        return TeaModel.build(map, self);
    }

    public OperateDataexportTriggerlogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateDataexportTriggerlogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateDataexportTriggerlogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateDataexportTriggerlogRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateDataexportTriggerlogRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OperateDataexportTriggerlogRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateDataexportTriggerlogRequest setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

}
