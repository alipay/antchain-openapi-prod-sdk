// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class ContactInfo extends TeaModel {
    // 联系人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联系人手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 联系人电话号码
    @NameInMap("phone")
    public String phone;

    // 联系人类型, LEGAL_PERSON-法人；CONTROLLER-实际控制人；AGENT-代理人；OTHER-其他
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ContactInfo build(java.util.Map<String, ?> map) throws Exception {
        ContactInfo self = new ContactInfo();
        return TeaModel.build(map, self);
    }

    public ContactInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContactInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContactInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ContactInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
