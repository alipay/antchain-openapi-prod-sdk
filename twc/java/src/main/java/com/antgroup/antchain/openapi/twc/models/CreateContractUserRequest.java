// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户类型为机构时，填写机构信息
    @NameInMap("organization")
    public ContractOrganizationApplication organization;

    // 用户类型为个人时，则为个人用户信息；用户类型为机构时，则为机构账号经办人信息
    @NameInMap("user")
    @Validation(required = true)
    public ContractAccountApplication user;

    // 用户类型，个人（PERSON）或机构（ORGANIZATION）
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    public static CreateContractUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractUserRequest self = new CreateContractUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractUserRequest setOrganization(ContractOrganizationApplication organization) {
        this.organization = organization;
        return this;
    }
    public ContractOrganizationApplication getOrganization() {
        return this.organization;
    }

    public CreateContractUserRequest setUser(ContractAccountApplication user) {
        this.user = user;
        return this;
    }
    public ContractAccountApplication getUser() {
        return this.user;
    }

    public CreateContractUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
