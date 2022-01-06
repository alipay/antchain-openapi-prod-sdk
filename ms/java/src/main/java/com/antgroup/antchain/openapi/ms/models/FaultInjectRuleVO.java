// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultInjectRuleVO extends TeaModel {
    // 主键
    @NameInMap("id")
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 服务ID
    @NameInMap("data_id")
    public String dataId;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 服务类型（SOFA DUBBO SPRINGCLOUD）
    @NameInMap("service_type")
    public String serviceType;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 是否启用规则
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
    public FaultInjectRuleConfigModel ruleConfig;

    public static FaultInjectRuleVO build(java.util.Map<String, ?> map) throws Exception {
        FaultInjectRuleVO self = new FaultInjectRuleVO();
        return TeaModel.build(map, self);
    }

    public FaultInjectRuleVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public FaultInjectRuleVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FaultInjectRuleVO setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public FaultInjectRuleVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public FaultInjectRuleVO setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public FaultInjectRuleVO setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public FaultInjectRuleVO setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public FaultInjectRuleVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public FaultInjectRuleVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public FaultInjectRuleVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public FaultInjectRuleVO setRuleConfig(FaultInjectRuleConfigModel ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public FaultInjectRuleConfigModel getRuleConfig() {
        return this.ruleConfig;
    }

}
