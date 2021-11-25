// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class UserData extends TeaModel {
    // 账号id
    @NameInMap("login_id")
    @Validation(required = true)
    public String loginId;

    // 账号id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 用户类型
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 关联企业
    @NameInMap("ref_firms")
    @Validation(required = true)
    public java.util.List<RefFirm> refFirms;

    // 认证状态
    @NameInMap("cert_status")
    @Validation(required = true)
    public String certStatus;

    // 账户类别
    @NameInMap("account_type")
    @Validation(required = true)
    public String accountType;

    // did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static UserData build(java.util.Map<String, ?> map) throws Exception {
        UserData self = new UserData();
        return TeaModel.build(map, self);
    }

    public UserData setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public UserData setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public UserData setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public UserData setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UserData setRefFirms(java.util.List<RefFirm> refFirms) {
        this.refFirms = refFirms;
        return this;
    }
    public java.util.List<RefFirm> getRefFirms() {
        return this.refFirms;
    }

    public UserData setCertStatus(String certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public String getCertStatus() {
        return this.certStatus;
    }

    public UserData setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public UserData setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
