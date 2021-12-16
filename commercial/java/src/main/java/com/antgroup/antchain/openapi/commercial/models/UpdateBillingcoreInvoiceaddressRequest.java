// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class UpdateBillingcoreInvoiceaddressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发票寄送地址
    @NameInMap("invoice_address")
    @Validation(required = true)
    public InvoiceAddress invoiceAddress;

    // 请求唯一id，可以是时间戳
    @NameInMap("request_unique_id")
    public String requestUniqueId;

    public static UpdateBillingcoreInvoiceaddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBillingcoreInvoiceaddressRequest self = new UpdateBillingcoreInvoiceaddressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBillingcoreInvoiceaddressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBillingcoreInvoiceaddressRequest setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
        return this;
    }
    public InvoiceAddress getInvoiceAddress() {
        return this.invoiceAddress;
    }

    public UpdateBillingcoreInvoiceaddressRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
