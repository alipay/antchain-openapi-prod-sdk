// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryMcpGetcurtimeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前日期时间
    @NameInMap("datetime")
    public String datetime;

    // 周几
    @NameInMap("week_day")
    public String weekDay;

    // 是否交易日
    @NameInMap("if_trading_day")
    public String ifTradingDay;

    // 是否周最后交易日
    @NameInMap("if_week_end")
    public String ifWeekEnd;

    // 是否月最后交易日
    @NameInMap("if_month_end")
    public String ifMonthEnd;

    // 是否季最后交易日
    @NameInMap("if_quarter_end")
    public String ifQuarterEnd;

    // 是否年最后交易日
    @NameInMap("if_year_end")
    public String ifYearEnd;

    public static QueryMcpGetcurtimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcpGetcurtimeResponse self = new QueryMcpGetcurtimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcpGetcurtimeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMcpGetcurtimeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcpGetcurtimeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMcpGetcurtimeResponse setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }
    public String getDatetime() {
        return this.datetime;
    }

    public QueryMcpGetcurtimeResponse setWeekDay(String weekDay) {
        this.weekDay = weekDay;
        return this;
    }
    public String getWeekDay() {
        return this.weekDay;
    }

    public QueryMcpGetcurtimeResponse setIfTradingDay(String ifTradingDay) {
        this.ifTradingDay = ifTradingDay;
        return this;
    }
    public String getIfTradingDay() {
        return this.ifTradingDay;
    }

    public QueryMcpGetcurtimeResponse setIfWeekEnd(String ifWeekEnd) {
        this.ifWeekEnd = ifWeekEnd;
        return this;
    }
    public String getIfWeekEnd() {
        return this.ifWeekEnd;
    }

    public QueryMcpGetcurtimeResponse setIfMonthEnd(String ifMonthEnd) {
        this.ifMonthEnd = ifMonthEnd;
        return this;
    }
    public String getIfMonthEnd() {
        return this.ifMonthEnd;
    }

    public QueryMcpGetcurtimeResponse setIfQuarterEnd(String ifQuarterEnd) {
        this.ifQuarterEnd = ifQuarterEnd;
        return this;
    }
    public String getIfQuarterEnd() {
        return this.ifQuarterEnd;
    }

    public QueryMcpGetcurtimeResponse setIfYearEnd(String ifYearEnd) {
        this.ifYearEnd = ifYearEnd;
        return this;
    }
    public String getIfYearEnd() {
        return this.ifYearEnd;
    }

}
