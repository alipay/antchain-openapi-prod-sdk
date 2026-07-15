// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryElectricMarketpriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 市场码
    @NameInMap("market_code")
    @Validation(required = true)
    public String marketCode;

    // 查询类型:DAY_AHEAD 日前预测 / REALTIME 实时,可单传或都传
    @NameInMap("query_type_list")
    @Validation(required = true)
    public java.util.List<String> queryTypeList;

    // 查询日期起始,格式 yyyy-MM-dd,与 query_date_end 配套闭区间,最多7天,与 query_date_list 二选一
    @NameInMap("query_date_start")
    public String queryDateStart;

    // 查询日期结束,格式 yyyy-MM-dd,与 query_date_start 配套闭区间,最多7天,与 query_date_list 二选一
    @NameInMap("query_date_end")
    public String queryDateEnd;

    // 查询日期列表,格式 yyyy-MM-dd,与 start/end 二选一,最多7个
    @NameInMap("query_date_list")
    public java.util.List<String> queryDateList;

    // 时点起始,1~96 整数,不传默认1
    @NameInMap("period_start")
    public Long periodStart;

    // 时点结束,1~96 整数,不传默认96
    @NameInMap("period_end")
    public Long periodEnd;

    public static QueryElectricMarketpriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectricMarketpriceRequest self = new QueryElectricMarketpriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectricMarketpriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectricMarketpriceRequest setMarketCode(String marketCode) {
        this.marketCode = marketCode;
        return this;
    }
    public String getMarketCode() {
        return this.marketCode;
    }

    public QueryElectricMarketpriceRequest setQueryTypeList(java.util.List<String> queryTypeList) {
        this.queryTypeList = queryTypeList;
        return this;
    }
    public java.util.List<String> getQueryTypeList() {
        return this.queryTypeList;
    }

    public QueryElectricMarketpriceRequest setQueryDateStart(String queryDateStart) {
        this.queryDateStart = queryDateStart;
        return this;
    }
    public String getQueryDateStart() {
        return this.queryDateStart;
    }

    public QueryElectricMarketpriceRequest setQueryDateEnd(String queryDateEnd) {
        this.queryDateEnd = queryDateEnd;
        return this;
    }
    public String getQueryDateEnd() {
        return this.queryDateEnd;
    }

    public QueryElectricMarketpriceRequest setQueryDateList(java.util.List<String> queryDateList) {
        this.queryDateList = queryDateList;
        return this;
    }
    public java.util.List<String> getQueryDateList() {
        return this.queryDateList;
    }

    public QueryElectricMarketpriceRequest setPeriodStart(Long periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public Long getPeriodStart() {
        return this.periodStart;
    }

    public QueryElectricMarketpriceRequest setPeriodEnd(Long periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public Long getPeriodEnd() {
        return this.periodEnd;
    }

}
