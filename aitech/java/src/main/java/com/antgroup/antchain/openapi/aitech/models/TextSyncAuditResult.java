// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class TextSyncAuditResult extends TeaModel {
    // 任务id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 数据Id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 业务Id - 调用方透传
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
    /**
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("risk_level")
    @Validation(required = true)
    public String riskLevel;

    // 审核标签列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;:&quot;sex&quot;, &quot;probability&quot;:66.5, &quot;description&quot;:&quot;疑似色情内容&quot;, &quot;riskWords&quot;:&quot;AA,BB,CC&quot;}]</p>
     */
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<AuditSyncLabel> labels;

    public static TextSyncAuditResult build(java.util.Map<String, ?> map) throws Exception {
        TextSyncAuditResult self = new TextSyncAuditResult();
        return TeaModel.build(map, self);
    }

    public TextSyncAuditResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TextSyncAuditResult setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public TextSyncAuditResult setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public TextSyncAuditResult setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public TextSyncAuditResult setLabels(java.util.List<AuditSyncLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<AuditSyncLabel> getLabels() {
        return this.labels;
    }

}
