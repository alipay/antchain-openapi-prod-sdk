// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UserInfo extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 用户来源系统，例如BUC,LDAP
    @NameInMap("source_system")
    public String sourceSystem;

    // 用户在源系统的id
    @NameInMap("source_user_id")
    public String sourceUserId;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 真实名
    @NameInMap("real_name")
    public String realName;

    // 昵称
    @NameInMap("nick_name")
    public String nickName;

    // 客户ID
    @NameInMap("customer_id")
    public String customerId;

    // 是否超级管理员
    @NameInMap("type")
    public String type;

    // 用户状态
    @NameInMap("status")
    public String status;

    // 即时通信账号
    @NameInMap("im_account")
    public String imAccount;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 联系座机
    @NameInMap("phone")
    public String phone;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 工号
    @NameInMap("work_no")
    public String workNo;

    // 英文名
    @NameInMap("en_name")
    public String enName;

    // 性别
    @NameInMap("sex")
    public String sex;

    // 国籍
    @NameInMap("nation_country")
    public String nationCountry;

    // 民族
    @NameInMap("nation")
    public String nation;

    // 个人照片路径
    @NameInMap("personal_photo")
    public String personalPhoto;

    // 上次登录时间.
    @NameInMap("last_logon_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String lastLogonTime;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    public static UserInfo build(java.util.Map<String, ?> map) throws Exception {
        UserInfo self = new UserInfo();
        return TeaModel.build(map, self);
    }

    public UserInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UserInfo setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public UserInfo setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }
    public String getSourceUserId() {
        return this.sourceUserId;
    }

    public UserInfo setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public UserInfo setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public UserInfo setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public UserInfo setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public UserInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UserInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UserInfo setImAccount(String imAccount) {
        this.imAccount = imAccount;
        return this;
    }
    public String getImAccount() {
        return this.imAccount;
    }

    public UserInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UserInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UserInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UserInfo setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public UserInfo setEnName(String enName) {
        this.enName = enName;
        return this;
    }
    public String getEnName() {
        return this.enName;
    }

    public UserInfo setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public UserInfo setNationCountry(String nationCountry) {
        this.nationCountry = nationCountry;
        return this;
    }
    public String getNationCountry() {
        return this.nationCountry;
    }

    public UserInfo setNation(String nation) {
        this.nation = nation;
        return this;
    }
    public String getNation() {
        return this.nation;
    }

    public UserInfo setPersonalPhoto(String personalPhoto) {
        this.personalPhoto = personalPhoto;
        return this;
    }
    public String getPersonalPhoto() {
        return this.personalPhoto;
    }

    public UserInfo setLastLogonTime(String lastLogonTime) {
        this.lastLogonTime = lastLogonTime;
        return this;
    }
    public String getLastLogonTime() {
        return this.lastLogonTime;
    }

    public UserInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UserInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
