// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class EnableBusinessruleOperateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 环境
    @NameInMap("env")
    public String env;

    // 版本（不传为创建新版）
    @NameInMap("rule_version")
    @Validation(required = true)
    public String ruleVersion;

    public static EnableBusinessruleOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableBusinessruleOperateRequest self = new EnableBusinessruleOperateRequest();
        return TeaModel.build(map, self);
    }

    public EnableBusinessruleOperateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableBusinessruleOperateRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public EnableBusinessruleOperateRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public EnableBusinessruleOperateRequest setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }
    public String getRuleVersion() {
        return this.ruleVersion;
    }

}
