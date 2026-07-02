// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicUserInfo extends TeaModel {
    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>DWWS2D</p>
     */
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 金融云用户Id
    // 
    /**
     * <strong>example:</strong>
     * <p>12321321</p>
     */
    @NameInMap("cloud_user_id")
    @Validation(required = true)
    public String cloudUserId;

    // 金融云平台的登录名
    // 
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@alitest.com">xxx@alitest.com</a></p>
     */
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 权限集合
    @NameInMap("permission_list")
    @Validation(required = true)
    public java.util.List<IotBasicRolePermission> permissionList;

    public static IotBasicUserInfo build(java.util.Map<String, ?> map) throws Exception {
        IotBasicUserInfo self = new IotBasicUserInfo();
        return TeaModel.build(map, self);
    }

    public IotBasicUserInfo setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public IotBasicUserInfo setCloudUserId(String cloudUserId) {
        this.cloudUserId = cloudUserId;
        return this;
    }
    public String getCloudUserId() {
        return this.cloudUserId;
    }

    public IotBasicUserInfo setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public IotBasicUserInfo setPermissionList(java.util.List<IotBasicRolePermission> permissionList) {
        this.permissionList = permissionList;
        return this;
    }
    public java.util.List<IotBasicRolePermission> getPermissionList() {
        return this.permissionList;
    }

}
