// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AddBillingcoreInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一id，可以是时间戳
    @NameInMap("request_unique_id")
    public String requestUniqueId;

    // 发票信息
    @NameInMap("invoice")
    @Validation(required = true)
    public Invoice invoice;

    public static AddBillingcoreInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBillingcoreInvoiceRequest self = new AddBillingcoreInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public AddBillingcoreInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBillingcoreInvoiceRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public AddBillingcoreInvoiceRequest setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }

}
