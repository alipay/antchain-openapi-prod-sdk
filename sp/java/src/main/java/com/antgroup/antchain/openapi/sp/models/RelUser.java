// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class RelUser extends TeaModel {
    // 工号
    @NameInMap("emp_id")
    @Validation(required = true)
    public String empId;

    // 域账号
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 花名
    @NameInMap("nick_name")
    @Validation(required = true)
    public String nickName;

    // 角色，PD-产品经理，DEV-研发
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    public static RelUser build(java.util.Map<String, ?> map) throws Exception {
        RelUser self = new RelUser();
        return TeaModel.build(map, self);
    }

    public RelUser setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public RelUser setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public RelUser setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public RelUser setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
