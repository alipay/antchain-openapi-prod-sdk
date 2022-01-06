// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgFaultinjectruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 服务类型（SOFA DUBBO SPRINGCLOUD）
    @NameInMap("service_type")
    public String serviceType;

    // 规则名称
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    // 故障注入规则配置（json串）
    @NameInMap("rule_config")
    @Validation(required = true)
    public String ruleConfig;

    public static AddSgFaultinjectruleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgFaultinjectruleRequest self = new AddSgFaultinjectruleRequest();
        return TeaModel.build(map, self);
    }

    public AddSgFaultinjectruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgFaultinjectruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgFaultinjectruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgFaultinjectruleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddSgFaultinjectruleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddSgFaultinjectruleRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AddSgFaultinjectruleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddSgFaultinjectruleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

}
