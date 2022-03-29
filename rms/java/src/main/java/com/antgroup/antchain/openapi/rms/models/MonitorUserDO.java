// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class MonitorUserDO extends TeaModel {
    // 登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 昵称(花名或显示名)
    @NameInMap("nick_name")
    @Validation(required = true)
    public String nickName;

    // 手机号码
    @NameInMap("phone_num")
    @Validation(required = true)
    public String phoneNum;

    // 真名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // 一方化标记位
    @NameInMap("from_aliyun")
    @Validation(required = true)
    public Boolean fromAliyun;

    // 是否未超级管理员
    @NameInMap("super_admin")
    @Validation(required = true)
    public Boolean superAdmin;

    // 用户上的权限
    @NameInMap("super_viewer")
    @Validation(required = true)
    public Boolean superViewer;

    // super_admin或者super_viewer
    @NameInMap("is_super")
    @Validation(required = true)
    public Boolean isSuper;

    // 用户 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 用户来源
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    public static MonitorUserDO build(java.util.Map<String, ?> map) throws Exception {
        MonitorUserDO self = new MonitorUserDO();
        return TeaModel.build(map, self);
    }

    public MonitorUserDO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public MonitorUserDO setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public MonitorUserDO setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public MonitorUserDO setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public MonitorUserDO setFromAliyun(Boolean fromAliyun) {
        this.fromAliyun = fromAliyun;
        return this;
    }
    public Boolean getFromAliyun() {
        return this.fromAliyun;
    }

    public MonitorUserDO setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
        return this;
    }
    public Boolean getSuperAdmin() {
        return this.superAdmin;
    }

    public MonitorUserDO setSuperViewer(Boolean superViewer) {
        this.superViewer = superViewer;
        return this;
    }
    public Boolean getSuperViewer() {
        return this.superViewer;
    }

    public MonitorUserDO setIsSuper(Boolean isSuper) {
        this.isSuper = isSuper;
        return this;
    }
    public Boolean getIsSuper() {
        return this.isSuper;
    }

    public MonitorUserDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorUserDO setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

}
