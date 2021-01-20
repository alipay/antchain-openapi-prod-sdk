// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Operator extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // login_name
    @NameInMap("login_name")
    public String loginName;

    // email
    @NameInMap("email")
    public String email;

    // nick_name
    @NameInMap("nick_name")
    public String nickName;

    public static Operator build(java.util.Map<String, ?> map) throws Exception {
        Operator self = new Operator();
        return TeaModel.build(map, self);
    }

    public Operator setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Operator setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public Operator setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Operator setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

}
