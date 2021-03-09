// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 企业唯一标识
    @NameInMap("customer")
    public String customer;

    // 外部对接系统操作员ID
    @NameInMap("external_id")
    public String externalId;

    // 外部对接系统类型
    @NameInMap("external_system")
    public String externalSystem;

    // 操作员唯一登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 操作员昵称
    @NameInMap("nickname")
    public String nickname;

    // 操作员真实姓名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // 租户唯一标识
    @NameInMap("tenant")
    public String tenant;

    // 业务场景码
    @NameInMap("bussiness_code")
    public String bussinessCode;

    public static CreateOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOperatorRequest self = new CreateOperatorRequest();
        return TeaModel.build(map, self);
    }

    public CreateOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOperatorRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public CreateOperatorRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public CreateOperatorRequest setExternalSystem(String externalSystem) {
        this.externalSystem = externalSystem;
        return this;
    }
    public String getExternalSystem() {
        return this.externalSystem;
    }

    public CreateOperatorRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateOperatorRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateOperatorRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public CreateOperatorRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public CreateOperatorRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateOperatorRequest setBussinessCode(String bussinessCode) {
        this.bussinessCode = bussinessCode;
        return this;
    }
    public String getBussinessCode() {
        return this.bussinessCode;
    }

}
