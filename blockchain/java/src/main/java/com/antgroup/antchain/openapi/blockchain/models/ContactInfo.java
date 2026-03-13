// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContactInfo extends TeaModel {
    // 联系人名字
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>13888888888</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 电子邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:user@domain.com">user@domain.com</a></p>
     */
    @NameInMap("email")
    public String email;

    // 电话
    /**
     * <strong>example:</strong>
     * <p>0571-85022088</p>
     */
    @NameInMap("phone")
    public String phone;

    // 身份证号
    /**
     * <strong>example:</strong>
     * <p>110000199001011234</p>
     */
    @NameInMap("id_card_no")
    public String idCardNo;

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

    public ContactInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ContactInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ContactInfo setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
        return this;
    }
    public String getIdCardNo() {
        return this.idCardNo;
    }

}
