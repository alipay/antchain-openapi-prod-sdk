// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>0000460699</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 登录名
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xsh@digital-engine.com">xsh@digital-engine.com</a></p>
     */
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public User setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
