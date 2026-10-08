// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class ResetAntdigitalWebttsDacCustomerroleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 新的角色列表
    @NameInMap("roles")
    @Validation(required = true)
    public java.util.List<RoleItem> roles;

    // 被更新客户的Operator Id
    @NameInMap("changed_operator_id")
    @Validation(required = true)
    public String changedOperatorId;

    public static ResetAntdigitalWebttsDacCustomerroleRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAntdigitalWebttsDacCustomerroleRequest self = new ResetAntdigitalWebttsDacCustomerroleRequest();
        return TeaModel.build(map, self);
    }

    public ResetAntdigitalWebttsDacCustomerroleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetAntdigitalWebttsDacCustomerroleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetAntdigitalWebttsDacCustomerroleRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public ResetAntdigitalWebttsDacCustomerroleRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ResetAntdigitalWebttsDacCustomerroleRequest setRoles(java.util.List<RoleItem> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<RoleItem> getRoles() {
        return this.roles;
    }

    public ResetAntdigitalWebttsDacCustomerroleRequest setChangedOperatorId(String changedOperatorId) {
        this.changedOperatorId = changedOperatorId;
        return this;
    }
    public String getChangedOperatorId() {
        return this.changedOperatorId;
    }

}
