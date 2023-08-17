// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class Admins extends TeaModel {
    // 管理员列表
    @NameInMap("users")
    public java.util.List<User> users;

    // 组ID
    @NameInMap("groups")
    public java.util.List<Groups> groups;

    public static Admins build(java.util.Map<String, ?> map) throws Exception {
        Admins self = new Admins();
        return TeaModel.build(map, self);
    }

    public Admins setUsers(java.util.List<User> users) {
        this.users = users;
        return this;
    }
    public java.util.List<User> getUsers() {
        return this.users;
    }

    public Admins setGroups(java.util.List<Groups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

}
