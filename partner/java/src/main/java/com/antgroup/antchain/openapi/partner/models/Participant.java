// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class Participant extends TeaModel {
    // 参与人角色
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // 参与人工号
    @NameInMap("work_no")
    @Validation(required = true)
    public String workNo;

    public static Participant build(java.util.Map<String, ?> map) throws Exception {
        Participant self = new Participant();
        return TeaModel.build(map, self);
    }

    public Participant setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public Participant setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

}
