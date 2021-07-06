// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBaicorpInternalmonitorasyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务方产品ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务方任务id，业务方保证唯一
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryBaicorpInternalmonitorasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaicorpInternalmonitorasyncRequest self = new QueryBaicorpInternalmonitorasyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaicorpInternalmonitorasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaicorpInternalmonitorasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaicorpInternalmonitorasyncRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBaicorpInternalmonitorasyncRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
