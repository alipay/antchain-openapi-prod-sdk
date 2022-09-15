// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreatePersonPermissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构ID(第三方指定ID 50字符)
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 项目角色ID(1项目管理员、2项目执行人、3项目财务)
    @NameInMap("role_id")
    @Validation(required = true)
    public Long roleId;

    // 项目ID(第三方指定ID 50字符)
    @NameInMap("pj_id")
    @Validation(required = true)
    public String pjId;

    // 被授权人支付宝用户标识(16字符)
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    public static CreatePersonPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonPermissionRequest self = new CreatePersonPermissionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonPermissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatePersonPermissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreatePersonPermissionRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreatePersonPermissionRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public CreatePersonPermissionRequest setPjId(String pjId) {
        this.pjId = pjId;
        return this;
    }
    public String getPjId() {
        return this.pjId;
    }

    public CreatePersonPermissionRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
