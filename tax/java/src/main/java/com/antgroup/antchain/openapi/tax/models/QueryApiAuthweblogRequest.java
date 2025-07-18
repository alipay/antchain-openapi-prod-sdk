// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiAuthweblogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 埋点日志日期（yyyyMMdd）
    @NameInMap("log_date")
    @Validation(required = true)
    public String logDate;

    public static QueryApiAuthweblogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiAuthweblogRequest self = new QueryApiAuthweblogRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiAuthweblogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiAuthweblogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiAuthweblogRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryApiAuthweblogRequest setLogDate(String logDate) {
        this.logDate = logDate;
        return this;
    }
    public String getLogDate() {
        return this.logDate;
    }

}
