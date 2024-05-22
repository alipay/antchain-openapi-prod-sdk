// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ExecRbbCompanyGuardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称或统一社会信用代码
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    // 规则ID，在风险大脑系统中配置
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    // 额外参数，与规则有关
    @NameInMap("params")
    public String params;

    // 虚拟云租户code
    @NameInMap("virtual_cloud_tenant_code")
    public String virtualCloudTenantCode;

    public static ExecRbbCompanyGuardRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRbbCompanyGuardRequest self = new ExecRbbCompanyGuardRequest();
        return TeaModel.build(map, self);
    }

    public ExecRbbCompanyGuardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRbbCompanyGuardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecRbbCompanyGuardRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ExecRbbCompanyGuardRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ExecRbbCompanyGuardRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ExecRbbCompanyGuardRequest setVirtualCloudTenantCode(String virtualCloudTenantCode) {
        this.virtualCloudTenantCode = virtualCloudTenantCode;
        return this;
    }
    public String getVirtualCloudTenantCode() {
        return this.virtualCloudTenantCode;
    }

}
