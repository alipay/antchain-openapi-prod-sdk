// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgDowngradesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 降级规则组id
    @NameInMap("group_id")
    @Validation(required = true)
    public Long groupId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 降级规则id
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 降级服务
    @NameInMap("downgrade_service")
    @Validation(required = true)
    public String downgradeService;

    // 规则名称
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    // 降级方法
    @NameInMap("downgrade_method")
    @Validation(required = true)
    public String downgradeMethod;

    // 运行模式
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    // 处理动作 (返回为空 返回错误)
    @NameInMap("strategy")
    @Validation(required = true)
    public String strategy;

    public static UpdateSgDowngradesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgDowngradesRequest self = new UpdateSgDowngradesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgDowngradesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgDowngradesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgDowngradesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateSgDowngradesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgDowngradesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public UpdateSgDowngradesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateSgDowngradesRequest setDowngradeService(String downgradeService) {
        this.downgradeService = downgradeService;
        return this;
    }
    public String getDowngradeService() {
        return this.downgradeService;
    }

    public UpdateSgDowngradesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateSgDowngradesRequest setDowngradeMethod(String downgradeMethod) {
        this.downgradeMethod = downgradeMethod;
        return this;
    }
    public String getDowngradeMethod() {
        return this.downgradeMethod;
    }

    public UpdateSgDowngradesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateSgDowngradesRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
