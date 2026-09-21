// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherLongrangeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求唯一标识，与入参一致；对应 Java requestId。
    @NameInMap("request_id")
    public String requestId;

    // 本次查询配额消耗，对应 quotaCost，成功查询固定为 1。
    @NameInMap("quota_cost")
    public String quotaCost;

    // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss。
    @NameInMap("forecast_batch_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String forecastBatchTime;

    // 中长期气象预测数据列表，未来第 16 天至指定截止天，每 6 小时一个数据点。仅返回请求指定的气象要素；网关字段需映射至 WeatherLongRangeVariableDTO 对应 Java 属性。
    @NameInMap("weather_variables_list")
    public java.util.List<WeatherLongRangeVariable> weatherVariablesList;

    public static QueryWeatherLongrangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherLongrangeResponse self = new QueryWeatherLongrangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryWeatherLongrangeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWeatherLongrangeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWeatherLongrangeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWeatherLongrangeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherLongrangeResponse setQuotaCost(String quotaCost) {
        this.quotaCost = quotaCost;
        return this;
    }
    public String getQuotaCost() {
        return this.quotaCost;
    }

    public QueryWeatherLongrangeResponse setForecastBatchTime(String forecastBatchTime) {
        this.forecastBatchTime = forecastBatchTime;
        return this;
    }
    public String getForecastBatchTime() {
        return this.forecastBatchTime;
    }

    public QueryWeatherLongrangeResponse setWeatherVariablesList(java.util.List<WeatherLongRangeVariable> weatherVariablesList) {
        this.weatherVariablesList = weatherVariablesList;
        return this;
    }
    public java.util.List<WeatherLongRangeVariable> getWeatherVariablesList() {
        return this.weatherVariablesList;
    }

}
