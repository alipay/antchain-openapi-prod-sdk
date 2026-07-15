// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContactInfo extends TeaModel {
    // 联系人-姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系人-电话
    /**
     * <strong>example:</strong>
     * <p>18888xxxx66</p>
     */
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

    // 联系人-电子邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:aaaaa@qq.com">aaaaa@qq.com</a></p>
     */
    @NameInMap("contact_email")
    @Validation(required = true)
    public String contactEmail;

    public static ContactInfo build(java.util.Map<String, ?> map) throws Exception {
        ContactInfo self = new ContactInfo();
        return TeaModel.build(map, self);
    }

    public ContactInfo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ContactInfo setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public ContactInfo setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

}
