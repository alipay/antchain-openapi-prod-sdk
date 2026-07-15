// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryElectricCommondataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 市场码
    @NameInMap("market_code")
    @Validation(required = true)
    public String marketCode;

    // 日前预测 / 实时
    @NameInMap("query_type_list")
    @Validation(required = true)
    public java.util.List<String> queryTypeList;

    // 与 query_date_end 配套闭区间，≤7 天
    @NameInMap("query_date_start")
    public String queryDateStart;

    @NameInMap("query_date_end")
    public String queryDateEnd;

    // 与 start/end 二选一，≤7 个
    @NameInMap("query_date_list")
    public java.util.List<String> queryDateList;

    // 默认 1
    @NameInMap("period_start")
    public String periodStart;

    // 默认96
    @NameInMap("period_end")
    public String periodEnd;

    public static QueryElectricCommondataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectricCommondataRequest self = new QueryElectricCommondataRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectricCommondataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectricCommondataRequest setMarketCode(String marketCode) {
        this.marketCode = marketCode;
        return this;
    }
    public String getMarketCode() {
        return this.marketCode;
    }

    public QueryElectricCommondataRequest setQueryTypeList(java.util.List<String> queryTypeList) {
        this.queryTypeList = queryTypeList;
        return this;
    }
    public java.util.List<String> getQueryTypeList() {
        return this.queryTypeList;
    }

    public QueryElectricCommondataRequest setQueryDateStart(String queryDateStart) {
        this.queryDateStart = queryDateStart;
        return this;
    }
    public String getQueryDateStart() {
        return this.queryDateStart;
    }

    public QueryElectricCommondataRequest setQueryDateEnd(String queryDateEnd) {
        this.queryDateEnd = queryDateEnd;
        return this;
    }
    public String getQueryDateEnd() {
        return this.queryDateEnd;
    }

    public QueryElectricCommondataRequest setQueryDateList(java.util.List<String> queryDateList) {
        this.queryDateList = queryDateList;
        return this;
    }
    public java.util.List<String> getQueryDateList() {
        return this.queryDateList;
    }

    public QueryElectricCommondataRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public QueryElectricCommondataRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

}
