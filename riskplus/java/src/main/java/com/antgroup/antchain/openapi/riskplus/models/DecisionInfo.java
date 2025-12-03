// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DecisionInfo extends TeaModel {
    // 状态
    /**
     * <strong>example:</strong>
     * <p>DECISION_SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 计划配置ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("offline_decision_plan_id")
    @Validation(required = true)
    public Long offlineDecisionPlanId;

    // 总数量
    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("total_num")
    @Validation(required = true)
    public Long totalNum;

    // 分层结果数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("decision_num")
    @Validation(required = true)
    public Long decisionNum;

    // 文件路径
    /**
     * <strong>example:</strong>
     * <p><a href="https://test-oss.oss-cn-shang">https://test-oss.oss-cn-shang</a></p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    public static DecisionInfo build(java.util.Map<String, ?> map) throws Exception {
        DecisionInfo self = new DecisionInfo();
        return TeaModel.build(map, self);
    }

    public DecisionInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DecisionInfo setOfflineDecisionPlanId(Long offlineDecisionPlanId) {
        this.offlineDecisionPlanId = offlineDecisionPlanId;
        return this;
    }
    public Long getOfflineDecisionPlanId() {
        return this.offlineDecisionPlanId;
    }

    public DecisionInfo setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DecisionInfo setDecisionNum(Long decisionNum) {
        this.decisionNum = decisionNum;
        return this;
    }
    public Long getDecisionNum() {
        return this.decisionNum;
    }

    public DecisionInfo setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
