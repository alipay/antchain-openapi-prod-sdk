// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AuthorizePolicy extends TeaModel {
    // 授权策略ID
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    // 授权策略描述
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 授权策略配置
    /**
     * <strong>example:</strong>
     * <p>授权策略配置</p>
     */
    @NameInMap("authorize_config")
    @Validation(required = true)
    public String authorizeConfig;

    public static AuthorizePolicy build(java.util.Map<String, ?> map) throws Exception {
        AuthorizePolicy self = new AuthorizePolicy();
        return TeaModel.build(map, self);
    }

    public AuthorizePolicy setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public AuthorizePolicy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AuthorizePolicy setAuthorizeConfig(String authorizeConfig) {
        this.authorizeConfig = authorizeConfig;
        return this;
    }
    public String getAuthorizeConfig() {
        return this.authorizeConfig;
    }

}
