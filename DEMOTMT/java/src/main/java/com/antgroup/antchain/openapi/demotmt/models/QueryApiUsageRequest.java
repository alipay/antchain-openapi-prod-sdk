// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demotmt.models;

import com.aliyun.tea.*;

public class QueryApiUsageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 年
    @NameInMap("year")
    @Validation(required = true)
    public String year;

    // 月
    @NameInMap("month")
    @Validation(required = true)
    public String month;

    public static QueryApiUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiUsageRequest self = new QueryApiUsageRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiUsageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiUsageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiUsageRequest setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

    public QueryApiUsageRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

}
