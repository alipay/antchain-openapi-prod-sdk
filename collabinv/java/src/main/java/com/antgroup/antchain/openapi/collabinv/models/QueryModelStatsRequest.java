// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelStatsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // yyyyMMdd
    @NameInMap("invoke_day")
    @Validation(required = true)
    public String invokeDay;

    // 类型：TENANT  租户；AK key维度
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QueryModelStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelStatsRequest self = new QueryModelStatsRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelStatsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelStatsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelStatsRequest setInvokeDay(String invokeDay) {
        this.invokeDay = invokeDay;
        return this;
    }
    public String getInvokeDay() {
        return this.invokeDay;
    }

    public QueryModelStatsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
