// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class VerifyUserPwdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 登录账号
    @NameInMap("login_id")
    @Validation(required = true)
    public String loginId;

    // 登录密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // 过期时间指定(单位 秒)，默认30分钟
    @NameInMap("expires")
    public Long expires;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 公钥名称
    @NameInMap("pubkey_name")
    @Validation(required = true)
    public String pubkeyName;

    public static VerifyUserPwdRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserPwdRequest self = new VerifyUserPwdRequest();
        return TeaModel.build(map, self);
    }

    public VerifyUserPwdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyUserPwdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyUserPwdRequest setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public VerifyUserPwdRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public VerifyUserPwdRequest setExpires(Long expires) {
        this.expires = expires;
        return this;
    }
    public Long getExpires() {
        return this.expires;
    }

    public VerifyUserPwdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public VerifyUserPwdRequest setPubkeyName(String pubkeyName) {
        this.pubkeyName = pubkeyName;
        return this;
    }
    public String getPubkeyName() {
        return this.pubkeyName;
    }

}
