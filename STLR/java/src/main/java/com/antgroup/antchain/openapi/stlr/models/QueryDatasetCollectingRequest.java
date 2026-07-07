// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryDatasetCollectingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部数据ID
    @NameInMap("dataset_id")
    @Validation(required = true)
    public String datasetId;

    // 操作用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 数据采集任务ID，若无查询最新的采集任务
    @NameInMap("task_id")
    public String taskId;

    public static QueryDatasetCollectingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetCollectingRequest self = new QueryDatasetCollectingRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetCollectingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatasetCollectingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDatasetCollectingRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public QueryDatasetCollectingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDatasetCollectingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
