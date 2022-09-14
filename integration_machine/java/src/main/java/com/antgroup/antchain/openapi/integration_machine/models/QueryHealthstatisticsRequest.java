// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryHealthstatisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 开始日期
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 结束日期(为空或等于开始日期时为查询当天)
    @NameInMap("end_date")
    public String endDate;

    // 统计类型(通行人数统计：PERSON，通行次数统计：NUMBER)
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QueryHealthstatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthstatisticsRequest self = new QueryHealthstatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryHealthstatisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHealthstatisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryHealthstatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryHealthstatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryHealthstatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
