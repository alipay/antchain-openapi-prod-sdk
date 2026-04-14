// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UmktCampaignTaskInfo extends TeaModel {
    // 任务唯一id
    /**
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 圈投任务执行日期，yyyy-MM-dd格式
    /**
     * <strong>example:</strong>
     * <p>2025-12-25</p>
     */
    @NameInMap("exec_date")
    @Validation(required = true)
    public String execDate;

    // 圈投任务执行批次
    /**
     * <strong>example:</strong>
     * <p>202512250020</p>
     */
    @NameInMap("exec_batch")
    @Validation(required = true)
    public String execBatch;

    // 圈投任务状态
    /**
     * <strong>example:</strong>
     * <p>D</p>
     */
    @NameInMap("campaign_task_status")
    @Validation(required = true)
    public String campaignTaskStatus;

    // 节点任务列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;nodeId&quot;:&quot;35d2171b68fd472c8f4cc5c293985d37&quot;,&quot;execDate&quot;:&quot;&quot;,&quot;nodeTaskStatus&quot;:&quot;F&quot;,&quot;relTaskList&quot;:[{&quot;resourceId&quot;:&quot;1007&quot;, &quot;taskStatus&quot;:&quot;F&quot;,&quot;errMsg&quot;:&quot;上游节点执行失败&quot;}]}</p>
     */
    @NameInMap("node_task_list")
    @Validation(required = true)
    public UmktCampaignNodeTaskInfo nodeTaskList;

    public static UmktCampaignTaskInfo build(java.util.Map<String, ?> map) throws Exception {
        UmktCampaignTaskInfo self = new UmktCampaignTaskInfo();
        return TeaModel.build(map, self);
    }

    public UmktCampaignTaskInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UmktCampaignTaskInfo setExecDate(String execDate) {
        this.execDate = execDate;
        return this;
    }
    public String getExecDate() {
        return this.execDate;
    }

    public UmktCampaignTaskInfo setExecBatch(String execBatch) {
        this.execBatch = execBatch;
        return this;
    }
    public String getExecBatch() {
        return this.execBatch;
    }

    public UmktCampaignTaskInfo setCampaignTaskStatus(String campaignTaskStatus) {
        this.campaignTaskStatus = campaignTaskStatus;
        return this;
    }
    public String getCampaignTaskStatus() {
        return this.campaignTaskStatus;
    }

    public UmktCampaignTaskInfo setNodeTaskList(UmktCampaignNodeTaskInfo nodeTaskList) {
        this.nodeTaskList = nodeTaskList;
        return this;
    }
    public UmktCampaignNodeTaskInfo getNodeTaskList() {
        return this.nodeTaskList;
    }

}
