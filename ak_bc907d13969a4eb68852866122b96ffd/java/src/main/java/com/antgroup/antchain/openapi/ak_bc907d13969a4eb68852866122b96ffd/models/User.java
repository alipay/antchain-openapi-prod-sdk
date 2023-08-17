// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    // 接入标注系统的用户ID
    @NameInMap("accountno")
    public String accountno;

    // 用户名称
    @NameInMap("username")
    public String username;

    // 用户来源
    @NameInMap("accountsource")
    public String accountsource;

    // UserId
    @NameInMap("userid")
    public String userid;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setAccountno(String accountno) {
        this.accountno = accountno;
        return this;
    }
    public String getAccountno() {
        return this.accountno;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public User setAccountsource(String accountsource) {
        this.accountsource = accountsource;
        return this;
    }
    public String getAccountsource() {
        return this.accountsource;
    }

    public User setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

}
