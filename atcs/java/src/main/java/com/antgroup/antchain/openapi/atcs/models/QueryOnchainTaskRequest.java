// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.atcs.models;

import com.aliyun.tea.*;

public class QueryOnchainTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户标识，如支付宝2088标识
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 任务标识列表
    @NameInMap("task_id_list")
    @Validation(required = true)
    public java.util.List<String> taskIdList;

    public static QueryOnchainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOnchainTaskRequest self = new QueryOnchainTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryOnchainTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOnchainTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOnchainTaskRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public QueryOnchainTaskRequest setTaskIdList(java.util.List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

}
