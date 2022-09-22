// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OperationLog extends TeaModel {
    // 工作空间组id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // LDC_PLAN或者LDC_SERVICE
    @NameInMap("entity")
    public String entity;

    // 操作。
    @NameInMap("action")
    public String action;

    // 发布单plan_id或者lks_service_id
    @NameInMap("target_id")
    public String targetId;

    // operatorId
    @NameInMap("operator_id")
    public String operatorId;

    // operatorName
    @NameInMap("operator_name")
    public String operatorName;

    // sourceSystem
    @NameInMap("source_system")
    public String sourceSystem;

    // context
    @NameInMap("context")
    public String context;

    // 集群id
    @NameInMap("cluster_id")
    public String clusterId;

    // pod名称
    @NameInMap("pod_name")
    public String podName;

    // 操作内容
    @NameInMap("content")
    public String content;

    // 创建时间
    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    public static OperationLog build(java.util.Map<String, ?> map) throws Exception {
        OperationLog self = new OperationLog();
        return TeaModel.build(map, self);
    }

    public OperationLog setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public OperationLog setEntity(String entity) {
        this.entity = entity;
        return this;
    }
    public String getEntity() {
        return this.entity;
    }

    public OperationLog setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperationLog setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public OperationLog setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperationLog setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public OperationLog setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public OperationLog setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public OperationLog setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperationLog setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public OperationLog setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public OperationLog setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}
