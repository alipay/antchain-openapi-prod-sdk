// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class OperateChaininsightStatisticRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 统计任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 操作方式； Delete 删除
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static OperateChaininsightStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateChaininsightStatisticRequest self = new OperateChaininsightStatisticRequest();
        return TeaModel.build(map, self);
    }

    public OperateChaininsightStatisticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateChaininsightStatisticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateChaininsightStatisticRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateChaininsightStatisticRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OperateChaininsightStatisticRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public OperateChaininsightStatisticRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
