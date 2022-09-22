// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DetailContainerserviceRevisiondiffResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 源版本配置详情
    @NameInMap("source_config")
    public ContainerServiceConfig sourceConfig;

    // 源版本号
    @NameInMap("source_revision")
    public String sourceRevision;

    // 目标版本配置详情
    @NameInMap("target_config")
    public ContainerServiceConfig targetConfig;

    // 目标版本号
    @NameInMap("target_revision")
    public String targetRevision;

    // 摘要信息
    @NameInMap("summary")
    public String summary;

    // diff详情，JSON数组字符串
    @NameInMap("diff_detail")
    public String diffDetail;

    // 风险等级: ORDINARY-一般、HIGH-高危	
    @NameInMap("risk_level")
    public String riskLevel;

    public static DetailContainerserviceRevisiondiffResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailContainerserviceRevisiondiffResponse self = new DetailContainerserviceRevisiondiffResponse();
        return TeaModel.build(map, self);
    }

    public DetailContainerserviceRevisiondiffResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailContainerserviceRevisiondiffResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailContainerserviceRevisiondiffResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailContainerserviceRevisiondiffResponse setSourceConfig(ContainerServiceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public ContainerServiceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    public DetailContainerserviceRevisiondiffResponse setSourceRevision(String sourceRevision) {
        this.sourceRevision = sourceRevision;
        return this;
    }
    public String getSourceRevision() {
        return this.sourceRevision;
    }

    public DetailContainerserviceRevisiondiffResponse setTargetConfig(ContainerServiceConfig targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }
    public ContainerServiceConfig getTargetConfig() {
        return this.targetConfig;
    }

    public DetailContainerserviceRevisiondiffResponse setTargetRevision(String targetRevision) {
        this.targetRevision = targetRevision;
        return this;
    }
    public String getTargetRevision() {
        return this.targetRevision;
    }

    public DetailContainerserviceRevisiondiffResponse setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public DetailContainerserviceRevisiondiffResponse setDiffDetail(String diffDetail) {
        this.diffDetail = diffDetail;
        return this;
    }
    public String getDiffDetail() {
        return this.diffDetail;
    }

    public DetailContainerserviceRevisiondiffResponse setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

}
