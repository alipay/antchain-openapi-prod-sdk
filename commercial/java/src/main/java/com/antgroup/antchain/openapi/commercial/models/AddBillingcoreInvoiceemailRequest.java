// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AddBillingcoreInvoiceemailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一id，可以是时间戳
    @NameInMap("request_unique_id")
    public String requestUniqueId;

    // 发票电子邮箱
    @NameInMap("invoice_email")
    @Validation(required = true)
    public InvoiceEmail invoiceEmail;

    public static AddBillingcoreInvoiceemailRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBillingcoreInvoiceemailRequest self = new AddBillingcoreInvoiceemailRequest();
        return TeaModel.build(map, self);
    }

    public AddBillingcoreInvoiceemailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBillingcoreInvoiceemailRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public AddBillingcoreInvoiceemailRequest setInvoiceEmail(InvoiceEmail invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
        return this;
    }
    public InvoiceEmail getInvoiceEmail() {
        return this.invoiceEmail;
    }

}
