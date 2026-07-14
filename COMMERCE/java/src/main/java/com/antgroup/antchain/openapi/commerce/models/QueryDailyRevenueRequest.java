// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class QueryDailyRevenueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 开始日期, yyyyMMdd格式
    @NameInMap("start_day")
    @Validation(required = true)
    public String startDay;

    // 结束日期， yyyyMMdd格式
    @NameInMap("end_day")
    @Validation(required = true)
    public String endDay;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否需要0元账单
    @NameInMap("need_zero_bill")
    @Validation(required = true)
    public Boolean needZeroBill;

    public static QueryDailyRevenueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDailyRevenueRequest self = new QueryDailyRevenueRequest();
        return TeaModel.build(map, self);
    }

    public QueryDailyRevenueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDailyRevenueRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryDailyRevenueRequest setStartDay(String startDay) {
        this.startDay = startDay;
        return this;
    }
    public String getStartDay() {
        return this.startDay;
    }

    public QueryDailyRevenueRequest setEndDay(String endDay) {
        this.endDay = endDay;
        return this;
    }
    public String getEndDay() {
        return this.endDay;
    }

    public QueryDailyRevenueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDailyRevenueRequest setNeedZeroBill(Boolean needZeroBill) {
        this.needZeroBill = needZeroBill;
        return this;
    }
    public Boolean getNeedZeroBill() {
        return this.needZeroBill;
    }

}
