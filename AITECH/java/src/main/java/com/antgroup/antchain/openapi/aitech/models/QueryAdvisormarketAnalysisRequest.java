// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryAdvisormarketAnalysisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建接口返回的任务 ID。type=result 时必填；type=status 时用于精确查询，不能与 task_status 同时传入。
    @NameInMap("task_id")
    public String taskId;

    // 查询模式。status 查询状态或任务列表；result 查询指定成功任务的结果下载地址。可选值：status、result。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 状态列表筛选条件，仅在 type=status 且未传 task_id 时使用。可选值：QUEUED、PROCESSING、SUCCESS、FAILED；不要传 CLOSED。
    @NameInMap("task_status")
    public String taskStatus;

    public static QueryAdvisormarketAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvisormarketAnalysisRequest self = new QueryAdvisormarketAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdvisormarketAnalysisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAdvisormarketAnalysisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAdvisormarketAnalysisRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryAdvisormarketAnalysisRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryAdvisormarketAnalysisRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
