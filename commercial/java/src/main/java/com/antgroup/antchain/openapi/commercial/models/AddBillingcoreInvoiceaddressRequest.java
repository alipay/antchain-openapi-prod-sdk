// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AddBillingcoreInvoiceaddressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一id，可以是时间戳
    @NameInMap("request_unique_id")
    public String requestUniqueId;

    // 发票寄送地址
    @NameInMap("invoice_address")
    @Validation(required = true)
    public InvoiceAddress invoiceAddress;

    public static AddBillingcoreInvoiceaddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBillingcoreInvoiceaddressRequest self = new AddBillingcoreInvoiceaddressRequest();
        return TeaModel.build(map, self);
    }

    public AddBillingcoreInvoiceaddressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBillingcoreInvoiceaddressRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public AddBillingcoreInvoiceaddressRequest setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
        return this;
    }
    public InvoiceAddress getInvoiceAddress() {
        return this.invoiceAddress;
    }

}
