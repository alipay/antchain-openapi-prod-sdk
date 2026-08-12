// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudInvoiceIntlconfigUserinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryAntcloudInvoiceIntlconfigUserinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudInvoiceIntlconfigUserinfoRequest self = new QueryAntcloudInvoiceIntlconfigUserinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
