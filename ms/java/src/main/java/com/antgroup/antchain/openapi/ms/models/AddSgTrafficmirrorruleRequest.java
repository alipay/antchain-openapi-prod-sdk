// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgTrafficmirrorruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 源应用
    @NameInMap("source_app")
    @Validation(required = true)
    public String sourceApp;

    // 源服务
    @NameInMap("source_data_id")
    @Validation(required = true)
    public String sourceDataId;

    // demo_mirror
    @NameInMap("target_app")
    @Validation(required = true)
    public String targetApp;

    // 目标服务id
    @NameInMap("target_data_id")
    @Validation(required = true)
    public String targetDataId;

    // 规则名
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    // 规则配置（json字符串）
    @NameInMap("rule_config")
    @Validation(required = true)
    public String ruleConfig;

    public static AddSgTrafficmirrorruleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgTrafficmirrorruleRequest self = new AddSgTrafficmirrorruleRequest();
        return TeaModel.build(map, self);
    }

    public AddSgTrafficmirrorruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgTrafficmirrorruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgTrafficmirrorruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgTrafficmirrorruleRequest setSourceApp(String sourceApp) {
        this.sourceApp = sourceApp;
        return this;
    }
    public String getSourceApp() {
        return this.sourceApp;
    }

    public AddSgTrafficmirrorruleRequest setSourceDataId(String sourceDataId) {
        this.sourceDataId = sourceDataId;
        return this;
    }
    public String getSourceDataId() {
        return this.sourceDataId;
    }

    public AddSgTrafficmirrorruleRequest setTargetApp(String targetApp) {
        this.targetApp = targetApp;
        return this;
    }
    public String getTargetApp() {
        return this.targetApp;
    }

    public AddSgTrafficmirrorruleRequest setTargetDataId(String targetDataId) {
        this.targetDataId = targetDataId;
        return this;
    }
    public String getTargetDataId() {
        return this.targetDataId;
    }

    public AddSgTrafficmirrorruleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddSgTrafficmirrorruleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

}
