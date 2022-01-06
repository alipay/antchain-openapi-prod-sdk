// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgTrafficmirrorruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名称
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    // 规则配置
    @NameInMap("rule_config")
    @Validation(required = true)
    public String ruleConfig;

    public static UpdateSgTrafficmirrorruleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgTrafficmirrorruleRequest self = new UpdateSgTrafficmirrorruleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgTrafficmirrorruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgTrafficmirrorruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgTrafficmirrorruleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgTrafficmirrorruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgTrafficmirrorruleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateSgTrafficmirrorruleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

}
