// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PlatformCustomerSummary extends TeaModel {
    // 三方平台的客户ID
    /**
     * <strong>example:</strong>
     * <p>2322323</p>
     */
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 三方平台客户名称
    /**
     * <strong>example:</strong>
     * <p>****有限公司</p>
     */
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 联系人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("contact_person")
    @Validation(required = true)
    public String contactPerson;

    // 联系电话
    /**
     * <strong>example:</strong>
     * <p>13655665566</p>
     */
    @NameInMap("contact_telephone")
    @Validation(required = true)
    public String contactTelephone;

    // 联系邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:ss@163.com">ss@163.com</a></p>
     */
    @NameInMap("contact_email")
    public String contactEmail;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>23123121</p>
     */
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    public static PlatformCustomerSummary build(java.util.Map<String, ?> map) throws Exception {
        PlatformCustomerSummary self = new PlatformCustomerSummary();
        return TeaModel.build(map, self);
    }

    public PlatformCustomerSummary setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public PlatformCustomerSummary setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public PlatformCustomerSummary setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }
    public String getContactPerson() {
        return this.contactPerson;
    }

    public PlatformCustomerSummary setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
        return this;
    }
    public String getContactTelephone() {
        return this.contactTelephone;
    }

    public PlatformCustomerSummary setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public PlatformCustomerSummary setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

}
