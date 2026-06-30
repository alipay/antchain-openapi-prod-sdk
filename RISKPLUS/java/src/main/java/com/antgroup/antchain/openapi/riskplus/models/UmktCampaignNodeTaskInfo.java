// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UmktCampaignNodeTaskInfo extends TeaModel {
    // 节点id
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点任务状态
    /**
     * <strong>example:</strong>
     * <p>D</p>
     */
    @NameInMap("node_task_status")
    @Validation(required = true)
    public String nodeTaskStatus;

    // 节点任务执行日期 yyyy-MM-dd格式
    /**
     * <strong>example:</strong>
     * <p>2025-12-25</p>
     */
    @NameInMap("exec_date")
    @Validation(required = true)
    public String execDate;

    // 节点任务关联资源任务列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;resourceId&quot;:&quot;bizCode&quot;,&quot;taskStatus&quot;:&quot;D&quot;}]</p>
     */
    @NameInMap("rel_task_list")
    @Validation(required = true)
    public java.util.List<UmktCampaignRelationTaskInfo> relTaskList;

    public static UmktCampaignNodeTaskInfo build(java.util.Map<String, ?> map) throws Exception {
        UmktCampaignNodeTaskInfo self = new UmktCampaignNodeTaskInfo();
        return TeaModel.build(map, self);
    }

    public UmktCampaignNodeTaskInfo setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UmktCampaignNodeTaskInfo setNodeTaskStatus(String nodeTaskStatus) {
        this.nodeTaskStatus = nodeTaskStatus;
        return this;
    }
    public String getNodeTaskStatus() {
        return this.nodeTaskStatus;
    }

    public UmktCampaignNodeTaskInfo setExecDate(String execDate) {
        this.execDate = execDate;
        return this;
    }
    public String getExecDate() {
        return this.execDate;
    }

    public UmktCampaignNodeTaskInfo setRelTaskList(java.util.List<UmktCampaignRelationTaskInfo> relTaskList) {
        this.relTaskList = relTaskList;
        return this;
    }
    public java.util.List<UmktCampaignRelationTaskInfo> getRelTaskList() {
        return this.relTaskList;
    }

}
