// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class DeviceUser extends TeaModel {
    // 用户id
    @NameInMap("device_user_id")
    public String deviceUserId;

    // 用户名称
    @NameInMap("device_user_name")
    public String deviceUserName;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    @NameInMap("role_type")
    public String roleType;

    // 权限(仅有设备所有权和设备使用权两种权限)
    @NameInMap("authority")
    public String authority;

    public static DeviceUser build(java.util.Map<String, ?> map) throws Exception {
        DeviceUser self = new DeviceUser();
        return TeaModel.build(map, self);
    }

    public DeviceUser setDeviceUserId(String deviceUserId) {
        this.deviceUserId = deviceUserId;
        return this;
    }
    public String getDeviceUserId() {
        return this.deviceUserId;
    }

    public DeviceUser setDeviceUserName(String deviceUserName) {
        this.deviceUserName = deviceUserName;
        return this;
    }
    public String getDeviceUserName() {
        return this.deviceUserName;
    }

    public DeviceUser setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public DeviceUser setAuthority(String authority) {
        this.authority = authority;
        return this;
    }
    public String getAuthority() {
        return this.authority;
    }

}
