// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demotmt.models;

import com.aliyun.tea.*;

public class QueryApiusageRequest extends TeaModel {
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

    public static QueryApiusageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiusageRequest self = new QueryApiusageRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiusageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiusageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiusageRequest setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

    public QueryApiusageRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

}
