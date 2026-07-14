// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class GetInvoicesFileurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发票ID
    @NameInMap("invoice_id")
    @Validation(required = true)
    public String invoiceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 系统来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static GetInvoicesFileurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInvoicesFileurlRequest self = new GetInvoicesFileurlRequest();
        return TeaModel.build(map, self);
    }

    public GetInvoicesFileurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInvoicesFileurlRequest setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public String getInvoiceId() {
        return this.invoiceId;
    }

    public GetInvoicesFileurlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetInvoicesFileurlRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
