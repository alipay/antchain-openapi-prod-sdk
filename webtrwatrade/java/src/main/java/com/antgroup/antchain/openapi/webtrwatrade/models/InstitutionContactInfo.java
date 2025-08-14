// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class InstitutionContactInfo extends TeaModel {
    // 联系人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("contact_person")
    @Validation(required = true)
    public String contactPerson;

    // 联系人邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:12345@gmail.com">12345@gmail.com</a></p>
     */
    @NameInMap("contact_email")
    @Validation(required = true)
    public String contactEmail;

    public static InstitutionContactInfo build(java.util.Map<String, ?> map) throws Exception {
        InstitutionContactInfo self = new InstitutionContactInfo();
        return TeaModel.build(map, self);
    }

    public InstitutionContactInfo setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }
    public String getContactPerson() {
        return this.contactPerson;
    }

    public InstitutionContactInfo setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

}
