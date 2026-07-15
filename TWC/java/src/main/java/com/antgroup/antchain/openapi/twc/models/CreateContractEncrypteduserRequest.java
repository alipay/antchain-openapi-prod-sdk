// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractEncrypteduserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 注册机构用户。类型为机构时(userType = "ORGANIZATION")，该字段必填。
    @NameInMap("organization")
    public ContractOrganizationApplication organization;

    // 注册为个人用户时，该字段表示个人用户的相关信息；
    // 注册为机构用户时，该字段表示对应机构经办人的个人信息。
    @NameInMap("user")
    @Validation(required = true)
    public ContractAccountApplication user;

    // 用户类型
    // 个人：PERSON；
    // 机构：ORGANIZATION
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    public static CreateContractEncrypteduserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractEncrypteduserRequest self = new CreateContractEncrypteduserRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractEncrypteduserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractEncrypteduserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractEncrypteduserRequest setOrganization(ContractOrganizationApplication organization) {
        this.organization = organization;
        return this;
    }
    public ContractOrganizationApplication getOrganization() {
        return this.organization;
    }

    public CreateContractEncrypteduserRequest setUser(ContractAccountApplication user) {
        this.user = user;
        return this;
    }
    public ContractAccountApplication getUser() {
        return this.user;
    }

    public CreateContractEncrypteduserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
