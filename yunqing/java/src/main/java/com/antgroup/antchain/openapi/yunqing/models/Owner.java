// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Owner extends TeaModel {
    // 应用Owner邮箱，云游资产使用。
    @NameInMap("owner_email")
    public String ownerEmail;

    // 应用Owner登陆名，云游资产使用。
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 应用Owner昵称，云游资产使用。
    @NameInMap("owner_nick_name")
    public String ownerNickName;

    // 应用Owner真实名称，云游资产使用。
    @NameInMap("owner_real_name")
    public String ownerRealName;

    // 应用Owner员工号，云游资产使用。
    @NameInMap("owner_staff_no")
    public String ownerStaffNo;

    public static Owner build(java.util.Map<String, ?> map) throws Exception {
        Owner self = new Owner();
        return TeaModel.build(map, self);
    }

    public Owner setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
        return this;
    }
    public String getOwnerEmail() {
        return this.ownerEmail;
    }

    public Owner setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public Owner setOwnerNickName(String ownerNickName) {
        this.ownerNickName = ownerNickName;
        return this;
    }
    public String getOwnerNickName() {
        return this.ownerNickName;
    }

    public Owner setOwnerRealName(String ownerRealName) {
        this.ownerRealName = ownerRealName;
        return this;
    }
    public String getOwnerRealName() {
        return this.ownerRealName;
    }

    public Owner setOwnerStaffNo(String ownerStaffNo) {
        this.ownerStaffNo = ownerStaffNo;
        return this;
    }
    public String getOwnerStaffNo() {
        return this.ownerStaffNo;
    }

}
