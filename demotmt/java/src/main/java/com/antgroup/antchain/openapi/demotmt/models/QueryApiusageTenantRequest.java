// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demotmt.models;

import com.aliyun.tea.*;

public class QueryApiusageTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 年
    @NameInMap("year")
    @Validation(required = true)
    public String year;

    // 月份
    @NameInMap("month")
    @Validation(required = true)
    public String month;

    // 租户id
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    public static QueryApiusageTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiusageTenantRequest self = new QueryApiusageTenantRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiusageTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiusageTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiusageTenantRequest setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

    public QueryApiusageTenantRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public QueryApiusageTenantRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
