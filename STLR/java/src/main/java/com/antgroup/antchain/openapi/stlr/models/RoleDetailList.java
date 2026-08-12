// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class RoleDetailList extends TeaModel {
    // 角色编码
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("role_no")
    @Validation(required = true)
    public String roleNo;

    // 角色名称
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 角色描述
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("description")
    public String description;

    public static RoleDetailList build(java.util.Map<String, ?> map) throws Exception {
        RoleDetailList self = new RoleDetailList();
        return TeaModel.build(map, self);
    }

    public RoleDetailList setRoleNo(String roleNo) {
        this.roleNo = roleNo;
        return this;
    }
    public String getRoleNo() {
        return this.roleNo;
    }

    public RoleDetailList setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RoleDetailList setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
