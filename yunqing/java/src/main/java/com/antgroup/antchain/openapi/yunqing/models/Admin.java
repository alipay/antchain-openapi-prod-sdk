// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Admin extends TeaModel {
    // 应用SRE邮箱，云游资产使用。
    @NameInMap("admin_email")
    public String adminEmail;

    // 应用SRE登陆名，云游资产使用。
    @NameInMap("admin_login_name")
    public String adminLoginName;

    // 应用SRE昵称，云游资产使用
    @NameInMap("admin_nick_name")
    public String adminNickName;

    // 应用SRE真实名称，云游资产使用
    @NameInMap("admin_real_name")
    public String adminRealName;

    // 应用SRE员工号，云游资产使用
    @NameInMap("admin_staff_no")
    public String adminStaffNo;

    public static Admin build(java.util.Map<String, ?> map) throws Exception {
        Admin self = new Admin();
        return TeaModel.build(map, self);
    }

    public Admin setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
        return this;
    }
    public String getAdminEmail() {
        return this.adminEmail;
    }

    public Admin setAdminLoginName(String adminLoginName) {
        this.adminLoginName = adminLoginName;
        return this;
    }
    public String getAdminLoginName() {
        return this.adminLoginName;
    }

    public Admin setAdminNickName(String adminNickName) {
        this.adminNickName = adminNickName;
        return this;
    }
    public String getAdminNickName() {
        return this.adminNickName;
    }

    public Admin setAdminRealName(String adminRealName) {
        this.adminRealName = adminRealName;
        return this;
    }
    public String getAdminRealName() {
        return this.adminRealName;
    }

    public Admin setAdminStaffNo(String adminStaffNo) {
        this.adminStaffNo = adminStaffNo;
        return this;
    }
    public String getAdminStaffNo() {
        return this.adminStaffNo;
    }

}
