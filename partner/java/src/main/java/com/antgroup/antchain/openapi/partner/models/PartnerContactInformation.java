// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class PartnerContactInformation extends TeaModel {
    // 企业联系人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 企业联系人手机
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 企业联系邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 通信邮编
    @NameInMap("post_code")
    @Validation(required = true)
    public String postCode;

    // 通信地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static PartnerContactInformation build(java.util.Map<String, ?> map) throws Exception {
        PartnerContactInformation self = new PartnerContactInformation();
        return TeaModel.build(map, self);
    }

    public PartnerContactInformation setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PartnerContactInformation setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public PartnerContactInformation setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public PartnerContactInformation setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public PartnerContactInformation setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
