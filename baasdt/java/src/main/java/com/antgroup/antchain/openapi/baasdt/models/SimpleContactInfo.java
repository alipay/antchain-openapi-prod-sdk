// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SimpleContactInfo extends TeaModel {
    // 联系人名称
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系电话
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

    public static SimpleContactInfo build(java.util.Map<String, ?> map) throws Exception {
        SimpleContactInfo self = new SimpleContactInfo();
        return TeaModel.build(map, self);
    }

    public SimpleContactInfo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SimpleContactInfo setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

}
