// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class CreateBusinessruleOperateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 规则列表
    @NameInMap("rules")
    @Validation(required = true)
    public java.util.List<BusinessRule> rules;

    // api版本（可选，传递则表示导入）
    @NameInMap("rule_version")
    public String ruleVersion;

    public static CreateBusinessruleOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessruleOperateRequest self = new CreateBusinessruleOperateRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessruleOperateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessruleOperateRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateBusinessruleOperateRequest setRules(java.util.List<BusinessRule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<BusinessRule> getRules() {
        return this.rules;
    }

    public CreateBusinessruleOperateRequest setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }
    public String getRuleVersion() {
        return this.ruleVersion;
    }

}
