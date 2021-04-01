// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateIpAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 该用户的在外部系统的用户Id
    @NameInMap("external_user_id")
    @Validation(required = true)
    public String externalUserId;

    // 该用户的在外部系统的用户名称
    @NameInMap("external_user_name")
    @Validation(required = true)
    public String externalUserName;

    // 角色:  1:版权方 2: 版权采购商  
    @NameInMap("role")
    @Validation(required = true)
    public Long role;

    public static CreateIpAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpAccountRequest self = new CreateIpAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIpAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIpAccountRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CreateIpAccountRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public CreateIpAccountRequest setExternalUserName(String externalUserName) {
        this.externalUserName = externalUserName;
        return this;
    }
    public String getExternalUserName() {
        return this.externalUserName;
    }

    public CreateIpAccountRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

}
