// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListLeagueRoleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 角色类型集合【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    @NameInMap("role_types")
    @Validation(required = true)
    public java.util.List<String> roleTypes;

    public static ListLeagueRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLeagueRoleRequest self = new ListLeagueRoleRequest();
        return TeaModel.build(map, self);
    }

    public ListLeagueRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListLeagueRoleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListLeagueRoleRequest setRoleTypes(java.util.List<String> roleTypes) {
        this.roleTypes = roleTypes;
        return this;
    }
    public java.util.List<String> getRoleTypes() {
        return this.roleTypes;
    }

}
