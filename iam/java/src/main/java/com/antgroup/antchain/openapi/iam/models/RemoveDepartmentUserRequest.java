// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class RemoveDepartmentUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待删除的部门成员关系列表
    @NameInMap("department_users")
    @Validation(required = true)
    public java.util.List<DepartmentUser> departmentUsers;

    public static RemoveDepartmentUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDepartmentUserRequest self = new RemoveDepartmentUserRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDepartmentUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveDepartmentUserRequest setDepartmentUsers(java.util.List<DepartmentUser> departmentUsers) {
        this.departmentUsers = departmentUsers;
        return this;
    }
    public java.util.List<DepartmentUser> getDepartmentUsers() {
        return this.departmentUsers;
    }

}
