// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class DepartmentUser extends TeaModel {
    // 部门唯一码
    @NameInMap("department_code")
    public String departmentCode;

    // 用户 id
    @NameInMap("user_id")
    public String userId;

    // 部门成员类型，
    @NameInMap("type")
    public String type;

    public static DepartmentUser build(java.util.Map<String, ?> map) throws Exception {
        DepartmentUser self = new DepartmentUser();
        return TeaModel.build(map, self);
    }

    public DepartmentUser setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
        return this;
    }
    public String getDepartmentCode() {
        return this.departmentCode;
    }

    public DepartmentUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DepartmentUser setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
