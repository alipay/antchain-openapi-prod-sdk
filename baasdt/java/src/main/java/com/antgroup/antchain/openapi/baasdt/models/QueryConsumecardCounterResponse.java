// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardCounterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 查询的类别（0 商家，1 商品）
    @NameInMap("type")
    public Long type;

    // 查询的id（type：0 为accountId 1为goodsId）
    @NameInMap("query_id")
    public String queryId;

    // 日统计数据
    @NameInMap("day_counter")
    public CounterData dayCounter;

    // 月统计数据
    @NameInMap("month_counter")
    public CounterData monthCounter;

    // 年统计数据
    @NameInMap("year_counter")
    public CounterData yearCounter;

    // 季度统计数据
    @NameInMap("quarterly_counter")
    public CounterData quarterlyCounter;

    public static QueryConsumecardCounterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardCounterResponse self = new QueryConsumecardCounterResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardCounterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardCounterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardCounterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardCounterResponse setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public QueryConsumecardCounterResponse setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public QueryConsumecardCounterResponse setDayCounter(CounterData dayCounter) {
        this.dayCounter = dayCounter;
        return this;
    }
    public CounterData getDayCounter() {
        return this.dayCounter;
    }

    public QueryConsumecardCounterResponse setMonthCounter(CounterData monthCounter) {
        this.monthCounter = monthCounter;
        return this;
    }
    public CounterData getMonthCounter() {
        return this.monthCounter;
    }

    public QueryConsumecardCounterResponse setYearCounter(CounterData yearCounter) {
        this.yearCounter = yearCounter;
        return this;
    }
    public CounterData getYearCounter() {
        return this.yearCounter;
    }

    public QueryConsumecardCounterResponse setQuarterlyCounter(CounterData quarterlyCounter) {
        this.quarterlyCounter = quarterlyCounter;
        return this;
    }
    public CounterData getQuarterlyCounter() {
        return this.quarterlyCounter;
    }

}
