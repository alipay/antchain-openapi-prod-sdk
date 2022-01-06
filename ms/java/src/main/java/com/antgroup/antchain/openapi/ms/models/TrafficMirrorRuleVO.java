// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TrafficMirrorRuleVO extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 源应用
    @NameInMap("source_app")
    public String sourceApp;

    // 源服务ID
    @NameInMap("source_data_id")
    public String sourceDataId;

    // 目标应用
    @NameInMap("target_app")
    public String targetApp;

    // 目标服务ID
    @NameInMap("target_data_id")
    public String targetDataId;

    // 规则名
    @NameInMap("rule_name")
    public String ruleName;

    // 是否开启
    @NameInMap("enabled")
    public Boolean enabled;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 规则配置
    @NameInMap("rule_config")
    public TrafficMirrorConfigModel ruleConfig;

    public static TrafficMirrorRuleVO build(java.util.Map<String, ?> map) throws Exception {
        TrafficMirrorRuleVO self = new TrafficMirrorRuleVO();
        return TeaModel.build(map, self);
    }

    public TrafficMirrorRuleVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TrafficMirrorRuleVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TrafficMirrorRuleVO setSourceApp(String sourceApp) {
        this.sourceApp = sourceApp;
        return this;
    }
    public String getSourceApp() {
        return this.sourceApp;
    }

    public TrafficMirrorRuleVO setSourceDataId(String sourceDataId) {
        this.sourceDataId = sourceDataId;
        return this;
    }
    public String getSourceDataId() {
        return this.sourceDataId;
    }

    public TrafficMirrorRuleVO setTargetApp(String targetApp) {
        this.targetApp = targetApp;
        return this;
    }
    public String getTargetApp() {
        return this.targetApp;
    }

    public TrafficMirrorRuleVO setTargetDataId(String targetDataId) {
        this.targetDataId = targetDataId;
        return this;
    }
    public String getTargetDataId() {
        return this.targetDataId;
    }

    public TrafficMirrorRuleVO setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public TrafficMirrorRuleVO setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public TrafficMirrorRuleVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public TrafficMirrorRuleVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TrafficMirrorRuleVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TrafficMirrorRuleVO setRuleConfig(TrafficMirrorConfigModel ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public TrafficMirrorConfigModel getRuleConfig() {
        return this.ruleConfig;
    }

}
