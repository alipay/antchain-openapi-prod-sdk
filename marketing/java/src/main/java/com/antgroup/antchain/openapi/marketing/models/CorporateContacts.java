// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class CorporateContacts extends TeaModel {
    // 职务
    @NameInMap("job_title")
    public String jobTitle;

    // 姓名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // 电话
    @NameInMap("mobile_phone")
    public String mobilePhone;

    // 邮箱
    @NameInMap("email")
    public String email;

    public static CorporateContacts build(java.util.Map<String, ?> map) throws Exception {
        CorporateContacts self = new CorporateContacts();
        return TeaModel.build(map, self);
    }

    public CorporateContacts setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }

    public CorporateContacts setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public CorporateContacts setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public CorporateContacts setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
