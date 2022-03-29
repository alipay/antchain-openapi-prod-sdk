// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AuthDO extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 登录名
    @NameInMap("user_login_name")
    @Validation(required = true)
    public String userLoginName;

    // 权限码
    @NameInMap("auth")
    @Validation(required = true)
    public String auth;

    // 权限的资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 权限的资源ID (如果FOLDER或CUSTOM_PLUGIN，需要自行转成Number类型)
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static AuthDO build(java.util.Map<String, ?> map) throws Exception {
        AuthDO self = new AuthDO();
        return TeaModel.build(map, self);
    }

    public AuthDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AuthDO setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
        return this;
    }
    public String getUserLoginName() {
        return this.userLoginName;
    }

    public AuthDO setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public AuthDO setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AuthDO setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
