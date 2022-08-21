// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciContentsecurityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 作品名称
    @NameInMap("work_name")
    @Validation(required = true)
    public String workName;

    // 作品哈希
    @NameInMap("work_hash")
    @Validation(required = true)
    public String workHash;

    // 作品类型
    @NameInMap("work_category")
    @Validation(required = true)
    public String workCategory;

    // 客户端令牌
    @NameInMap("client_token")
    public String clientToken;

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

    public QueryDciContentsecurityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
