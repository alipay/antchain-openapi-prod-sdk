// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class LoginOperationLogVO extends TeaModel {
    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户地址
    /**
     * <strong>example:</strong>
     * <p>0xe328b8785ff0c1ecb2b52198f5637cc1fdabab20</p>
     */
    @NameInMap("user_address")
    public String userAddress;

    // 登录名
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:123@qq.com">123@qq.com</a></p>
     */
    @NameInMap("login_name")
    public String loginName;

    // 登录类型
    /**
     * <strong>example:</strong>
     * <p>EMAIL</p>
     */
    @NameInMap("login_account_type")
    public String loginAccountType;

    // 请求URL
    /**
     * <strong>example:</strong>
     * <p>/api/v1/trade/ip/user/login-account/login</p>
     */
    @NameInMap("request_u_r_l")
    @Validation(required = true)
    public String requestURL;

    // 是否成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 创建时间
    @NameInMap("gmt_created")
    @Validation(required = true)
    public Long gmtCreated;

    public static LoginOperationLogVO build(java.util.Map<String, ?> map) throws Exception {
        LoginOperationLogVO self = new LoginOperationLogVO();
        return TeaModel.build(map, self);
    }

    public LoginOperationLogVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public LoginOperationLogVO setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public LoginOperationLogVO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public LoginOperationLogVO setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

    public LoginOperationLogVO setRequestURL(String requestURL) {
        this.requestURL = requestURL;
        return this;
    }
    public String getRequestURL() {
        return this.requestURL;
    }

    public LoginOperationLogVO setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LoginOperationLogVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

}
