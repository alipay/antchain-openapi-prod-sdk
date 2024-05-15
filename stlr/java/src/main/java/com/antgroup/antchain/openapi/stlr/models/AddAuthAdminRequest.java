// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddAuthAdminRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权策略ID
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    // 授权策略描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 授权策略配置
    @NameInMap("authorize_config")
    @Validation(required = true)
    public String authorizeConfig;

    public static AddAuthAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthAdminRequest self = new AddAuthAdminRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthAdminRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAuthAdminRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddAuthAdminRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public AddAuthAdminRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddAuthAdminRequest setAuthorizeConfig(String authorizeConfig) {
        this.authorizeConfig = authorizeConfig;
        return this;
    }
    public String getAuthorizeConfig() {
        return this.authorizeConfig;
    }

}
