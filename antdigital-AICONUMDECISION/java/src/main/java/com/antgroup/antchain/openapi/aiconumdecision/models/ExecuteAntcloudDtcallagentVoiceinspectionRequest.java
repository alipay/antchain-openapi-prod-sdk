// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class ExecuteAntcloudDtcallagentVoiceinspectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务空间实例编码，如 demo
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // 质检规则集 ID，如 qc-heiniu-v1
    @NameInMap("qc_rule_set_id")
    @Validation(required = true)
    public String qcRuleSetId;

    // 对话文本
    @NameInMap("voice_text")
    @Validation(required = true)
    public String voiceText;

    // 录音地址
    @NameInMap("voice_url")
    public String voiceUrl;

    // 调用方批次 ID
    @NameInMap("batch_id")
    public String batchId;

    // 调用方通话唯一标识
    @NameInMap("external_call_id")
    public String externalCallId;

    public static ExecuteAntcloudDtcallagentVoiceinspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAntcloudDtcallagentVoiceinspectionRequest self = new ExecuteAntcloudDtcallagentVoiceinspectionRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setQcRuleSetId(String qcRuleSetId) {
        this.qcRuleSetId = qcRuleSetId;
        return this;
    }
    public String getQcRuleSetId() {
        return this.qcRuleSetId;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setVoiceText(String voiceText) {
        this.voiceText = voiceText;
        return this;
    }
    public String getVoiceText() {
        return this.voiceText;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
        return this;
    }
    public String getVoiceUrl() {
        return this.voiceUrl;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionRequest setExternalCallId(String externalCallId) {
        this.externalCallId = externalCallId;
        return this;
    }
    public String getExternalCallId() {
        return this.externalCallId;
    }

}
