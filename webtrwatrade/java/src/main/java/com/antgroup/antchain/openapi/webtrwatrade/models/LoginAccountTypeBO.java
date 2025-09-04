// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class LoginAccountTypeBO extends TeaModel {
    // 登录类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("user_login_type")
    public String userLoginType;

    // 登录名称
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("login_name")
    public String loginName;

    public static LoginAccountTypeBO build(java.util.Map<String, ?> map) throws Exception {
        LoginAccountTypeBO self = new LoginAccountTypeBO();
        return TeaModel.build(map, self);
    }

    public LoginAccountTypeBO setUserLoginType(String userLoginType) {
        this.userLoginType = userLoginType;
        return this;
    }
    public String getUserLoginType() {
        return this.userLoginType;
    }

    public LoginAccountTypeBO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
