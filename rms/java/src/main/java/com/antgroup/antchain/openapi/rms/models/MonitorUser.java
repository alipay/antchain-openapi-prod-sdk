// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class MonitorUser extends TeaModel {
    // 用户来源
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    // 用户上的权限
    @NameInMap("super_viewer")
    @Validation(required = true)
    public Boolean superViewer;

    // 是否为超级管理员
    @NameInMap("super_admin")
    @Validation(required = true)
    public Boolean superAdmin;

    // 显示名，花名 
    @NameInMap("nick_name")
    @Validation(required = true)
    public String nickName;

    // emp_id
    @NameInMap("emp_id")
    @Validation(required = true)
    public String empId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 登录名，等于_id, _id实在太难辨别了，域帐号  yerui.yr
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 展示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 兼容UniversalRead里返回的userDisplayName
    @NameInMap("user_display_name")
    @Validation(required = true)
    public String userDisplayName;

    // 真名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // phone_num
    @NameInMap("phone_num")
    @Validation(required = true)
    public String phoneNum;

    // email
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // enterprise_id（金融云专属）
    @NameInMap("enterprise_id")
    @Validation(required = true)
    public String enterpriseId;

    // token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 一方化标记位
    @NameInMap("is_from_aliyun")
    @Validation(required = true)
    public Boolean isFromAliyun;

    public static MonitorUser build(java.util.Map<String, ?> map) throws Exception {
        MonitorUser self = new MonitorUser();
        return TeaModel.build(map, self);
    }

    public MonitorUser setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public MonitorUser setSuperViewer(Boolean superViewer) {
        this.superViewer = superViewer;
        return this;
    }
    public Boolean getSuperViewer() {
        return this.superViewer;
    }

    public MonitorUser setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
        return this;
    }
    public Boolean getSuperAdmin() {
        return this.superAdmin;
    }

    public MonitorUser setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public MonitorUser setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public MonitorUser setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorUser setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public MonitorUser setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public MonitorUser setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
        return this;
    }
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public MonitorUser setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public MonitorUser setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public MonitorUser setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public MonitorUser setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public MonitorUser setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public MonitorUser setIsFromAliyun(Boolean isFromAliyun) {
        this.isFromAliyun = isFromAliyun;
        return this;
    }
    public Boolean getIsFromAliyun() {
        return this.isFromAliyun;
    }

}
