// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class ContactInfo extends TeaModel {
    // 联系人
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系电话
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

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

}
