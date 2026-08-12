// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudInvoiceIntlinvoicesFileurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 发票ID
    @NameInMap("invoice_id")
    @Validation(required = true)
    public String invoiceId;

    public static QueryAntcloudInvoiceIntlinvoicesFileurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudInvoiceIntlinvoicesFileurlRequest self = new QueryAntcloudInvoiceIntlinvoicesFileurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudInvoiceIntlinvoicesFileurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudInvoiceIntlinvoicesFileurlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudInvoiceIntlinvoicesFileurlRequest setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public String getInvoiceId() {
        return this.invoiceId;
    }

}
