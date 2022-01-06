// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgDowngradesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 处理动作 (返回为空 返回错误)
    @NameInMap("strategy")
    @Validation(required = true)
    public String strategy;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 降级方法
    @NameInMap("downgrade_method")
    @Validation(required = true)
    public String downgradeMethod;

    // 降级服务
    @NameInMap("downgrade_service")
    @Validation(required = true)
    public String downgradeService;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 运行模式
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    // 规则名称
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    public static AddSgDowngradesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgDowngradesRequest self = new AddSgDowngradesRequest();
        return TeaModel.build(map, self);
    }

    public AddSgDowngradesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgDowngradesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgDowngradesRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public AddSgDowngradesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddSgDowngradesRequest setDowngradeMethod(String downgradeMethod) {
        this.downgradeMethod = downgradeMethod;
        return this;
    }
    public String getDowngradeMethod() {
        return this.downgradeMethod;
    }

    public AddSgDowngradesRequest setDowngradeService(String downgradeService) {
        this.downgradeService = downgradeService;
        return this;
    }
    public String getDowngradeService() {
        return this.downgradeService;
    }

    public AddSgDowngradesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgDowngradesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AddSgDowngradesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
