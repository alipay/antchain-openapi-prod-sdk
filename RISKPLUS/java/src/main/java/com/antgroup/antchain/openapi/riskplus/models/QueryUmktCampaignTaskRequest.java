// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktCampaignTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 半圈投计划id
    @NameInMap("campaign_id")
    @Validation(required = true)
    public Long campaignId;

    // 任务唯一id
    @NameInMap("task_id")
    public String taskId;

    // 圈投任务执行日期
    @NameInMap("exec_date")
    public String execDate;

    public static QueryUmktCampaignTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktCampaignTaskRequest self = new QueryUmktCampaignTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktCampaignTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktCampaignTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktCampaignTaskRequest setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public Long getCampaignId() {
        return this.campaignId;
    }

    public QueryUmktCampaignTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryUmktCampaignTaskRequest setExecDate(String execDate) {
        this.execDate = execDate;
        return this;
    }
    public String getExecDate() {
        return this.execDate;
    }

}
