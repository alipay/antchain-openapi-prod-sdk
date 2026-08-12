// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class RoleList extends TeaModel {
    // 角色编码
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("role_no")
    @Validation(required = true)
    public String roleNo;

    // 角色名称
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 角色描述
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("description")
    public String description;

    public static RoleList build(java.util.Map<String, ?> map) throws Exception {
        RoleList self = new RoleList();
        return TeaModel.build(map, self);
    }

    public RoleList setRoleNo(String roleNo) {
        this.roleNo = roleNo;
        return this;
    }
    public String getRoleNo() {
        return this.roleNo;
    }

    public RoleList setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RoleList setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
