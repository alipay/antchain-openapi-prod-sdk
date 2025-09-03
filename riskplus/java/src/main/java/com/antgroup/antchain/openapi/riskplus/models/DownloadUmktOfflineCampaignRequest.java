// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DownloadUmktOfflineCampaignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 圈投计划id
    @NameInMap("campaign_id")
    @Validation(required = true)
    public Long campaignId;

    // 节点id
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 关联圈客计划id
    @NameInMap("decision_plan_id")
    @Validation(required = true)
    public Long decisionPlanId;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static DownloadUmktOfflineCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadUmktOfflineCampaignRequest self = new DownloadUmktOfflineCampaignRequest();
        return TeaModel.build(map, self);
    }

    public DownloadUmktOfflineCampaignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadUmktOfflineCampaignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadUmktOfflineCampaignRequest setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public Long getCampaignId() {
        return this.campaignId;
    }

    public DownloadUmktOfflineCampaignRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DownloadUmktOfflineCampaignRequest setDecisionPlanId(Long decisionPlanId) {
        this.decisionPlanId = decisionPlanId;
        return this;
    }
    public Long getDecisionPlanId() {
        return this.decisionPlanId;
    }

    public DownloadUmktOfflineCampaignRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
