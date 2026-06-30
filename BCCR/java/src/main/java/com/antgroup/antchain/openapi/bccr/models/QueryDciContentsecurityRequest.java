// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciContentsecurityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID(数登流水号)
    @NameInMap("flow_number")
    @Validation(required = true)
    public String flowNumber;

    // 客户端令牌
    @NameInMap("client_token")
    public String clientToken;

    // 任务Id, 已废弃
    @NameInMap("task_id")
    public String taskId;

    // 作品名，已废弃
    @NameInMap("work_name")
    public String workName;

    // 作品Hash，已废弃
    @NameInMap("work_hash")
    public String workHash;

    // 作品分类，已废弃
    @NameInMap("work_category")
    public String workCategory;

    public static QueryDciContentsecurityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciContentsecurityRequest self = new QueryDciContentsecurityRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciContentsecurityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciContentsecurityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciContentsecurityRequest setFlowNumber(String flowNumber) {
        this.flowNumber = flowNumber;
        return this;
    }
    public String getFlowNumber() {
        return this.flowNumber;
    }

    public QueryDciContentsecurityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QueryDciContentsecurityRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryDciContentsecurityRequest setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
    }

    public QueryDciContentsecurityRequest setWorkHash(String workHash) {
        this.workHash = workHash;
        return this;
    }
    public String getWorkHash() {
        return this.workHash;
    }

    public QueryDciContentsecurityRequest setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
        return this;
    }
    public String getWorkCategory() {
        return this.workCategory;
    }

}
