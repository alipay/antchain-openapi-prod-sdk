// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBaicorpInternalevaluationasyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // bizinfo
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 基于安全考虑，填充NonceId
    @NameInMap("custom_id")
    @Validation(required = true)
    public String customId;

    // 监测任务Id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryBaicorpInternalevaluationasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaicorpInternalevaluationasyncRequest self = new QueryBaicorpInternalevaluationasyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaicorpInternalevaluationasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaicorpInternalevaluationasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaicorpInternalevaluationasyncRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBaicorpInternalevaluationasyncRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public QueryBaicorpInternalevaluationasyncRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public QueryBaicorpInternalevaluationasyncRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
