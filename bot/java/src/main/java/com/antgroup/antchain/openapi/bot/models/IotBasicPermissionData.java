// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicPermissionData extends TeaModel {
    // 权限编码
    @NameInMap("permission_code")
    @Validation(required = true)
    public String permissionCode;

    // 权限名称
    @NameInMap("permission_name")
    @Validation(required = true)
    public String permissionName;

    // 权限内容
    @NameInMap("permission_data")
    @Validation(required = true)
    public String permissionData;

    // 权限类型
    @NameInMap("permission_type")
    @Validation(required = true)
    public String permissionType;

    // 权限模块
    @NameInMap("module")
    @Validation(required = true)
    public String module;

    public static IotBasicPermissionData build(java.util.Map<String, ?> map) throws Exception {
        IotBasicPermissionData self = new IotBasicPermissionData();
        return TeaModel.build(map, self);
    }

    public IotBasicPermissionData setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
        return this;
    }
    public String getPermissionCode() {
        return this.permissionCode;
    }

    public IotBasicPermissionData setPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }
    public String getPermissionName() {
        return this.permissionName;
    }

    public IotBasicPermissionData setPermissionData(String permissionData) {
        this.permissionData = permissionData;
        return this;
    }
    public String getPermissionData() {
        return this.permissionData;
    }

    public IotBasicPermissionData setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

    public IotBasicPermissionData setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

}
