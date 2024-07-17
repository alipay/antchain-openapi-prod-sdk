// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class OutboundTaskListResponseData extends TeaModel {
    // 任务数据库id
    @NameInMap("id")
    public Long id;

    // 任务名称
    @NameInMap("name")
    public String name;

    // 任务id
    @NameInMap("code")
    public String code;

    // 流程前端id/流程code
    @NameInMap("flow_feld")
    public String flowFeld;

    // 流程id
    @NameInMap("flow_id")
    public Long flowId;

    // 流程名称
    @NameInMap("flow_name")
    public String flowName;

    // 流程环境区分
    // PRE——预发
    // PUB——线上
    @NameInMap("flow_env")
    public String flowEnv;

    // 规则id
    @NameInMap("rule_id")
    public Long ruleId;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 状态
    // USING-启用
    // UNUSED-不启用
    // DELETED-已删除
    @NameInMap("status")
    public String status;

    // 当前任务版本号
    @NameInMap("version")
    public Long version;

    // 当前引用流程版本号
    @NameInMap("flow_version")
    public Long flowVersion;

    // 流程最新的版本号
    @NameInMap("flow_latest_version")
    public Long flowLatestVersion;

    // 当前引用规则版本号
    @NameInMap("rule_version")
    public Long ruleVersion;

    // 规则最新的版本号
    @NameInMap("rule_latest_version")
    public Long ruleLatestVersion;

    // 任务最新的版本号
    @NameInMap("latest_version")
    public Long latestVersion;

    // 任务线上版本号
    @NameInMap("pub_version")
    public Long pubVersion;

    // 任务是否在发布流程中
    @NameInMap("publishing")
    @Validation(required = true)
    public Boolean publishing;

    public static OutboundTaskListResponseData build(java.util.Map<String, ?> map) throws Exception {
        OutboundTaskListResponseData self = new OutboundTaskListResponseData();
        return TeaModel.build(map, self);
    }

    public OutboundTaskListResponseData setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OutboundTaskListResponseData setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OutboundTaskListResponseData setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OutboundTaskListResponseData setFlowFeld(String flowFeld) {
        this.flowFeld = flowFeld;
        return this;
    }
    public String getFlowFeld() {
        return this.flowFeld;
    }

    public OutboundTaskListResponseData setFlowId(Long flowId) {
        this.flowId = flowId;
        return this;
    }
    public Long getFlowId() {
        return this.flowId;
    }

    public OutboundTaskListResponseData setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public OutboundTaskListResponseData setFlowEnv(String flowEnv) {
        this.flowEnv = flowEnv;
        return this;
    }
    public String getFlowEnv() {
        return this.flowEnv;
    }

    public OutboundTaskListResponseData setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public OutboundTaskListResponseData setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public OutboundTaskListResponseData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OutboundTaskListResponseData setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public OutboundTaskListResponseData setFlowVersion(Long flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public Long getFlowVersion() {
        return this.flowVersion;
    }

    public OutboundTaskListResponseData setFlowLatestVersion(Long flowLatestVersion) {
        this.flowLatestVersion = flowLatestVersion;
        return this;
    }
    public Long getFlowLatestVersion() {
        return this.flowLatestVersion;
    }

    public OutboundTaskListResponseData setRuleVersion(Long ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }
    public Long getRuleVersion() {
        return this.ruleVersion;
    }

    public OutboundTaskListResponseData setRuleLatestVersion(Long ruleLatestVersion) {
        this.ruleLatestVersion = ruleLatestVersion;
        return this;
    }
    public Long getRuleLatestVersion() {
        return this.ruleLatestVersion;
    }

    public OutboundTaskListResponseData setLatestVersion(Long latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public Long getLatestVersion() {
        return this.latestVersion;
    }

    public OutboundTaskListResponseData setPubVersion(Long pubVersion) {
        this.pubVersion = pubVersion;
        return this;
    }
    public Long getPubVersion() {
        return this.pubVersion;
    }

    public OutboundTaskListResponseData setPublishing(Boolean publishing) {
        this.publishing = publishing;
        return this;
    }
    public Boolean getPublishing() {
        return this.publishing;
    }

}
