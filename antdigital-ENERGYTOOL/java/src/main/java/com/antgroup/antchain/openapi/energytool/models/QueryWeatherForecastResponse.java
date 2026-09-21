// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherForecastResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次查询消耗的额度，Java 类型 BigDecimal；内部数据链路成功查询固定消耗 1，MAYA 链路取下游返回值，可能为空。
    @NameInMap("quota_cost")
    public String quotaCost;

    // 实际返回的气象预测数据批次时间，Java 类型 Date；数据链路未提供批次时可能为空。
    @NameInMap("forecast_batch_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String forecastBatchTime;

    // 气象数据列表，每个元素为 WeatherVariableDTO，包含时间、预测批次及各气象要素。要素值在 Java DTO 中为 String，未返回或缺测时可能为空。
    @NameInMap("weather_variables_list")
    public java.util.List<WeatherVariable> weatherVariablesList;

    // 本次请求 ID
    @NameInMap("request_id")
    public String requestId;

    public static QueryWeatherForecastResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherForecastResponse self = new QueryWeatherForecastResponse();
        return TeaModel.build(map, self);
    }

    public QueryWeatherForecastResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWeatherForecastResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWeatherForecastResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWeatherForecastResponse setQuotaCost(String quotaCost) {
        this.quotaCost = quotaCost;
        return this;
    }
    public String getQuotaCost() {
        return this.quotaCost;
    }

    public QueryWeatherForecastResponse setForecastBatchTime(String forecastBatchTime) {
        this.forecastBatchTime = forecastBatchTime;
        return this;
    }
    public String getForecastBatchTime() {
        return this.forecastBatchTime;
    }

    public QueryWeatherForecastResponse setWeatherVariablesList(java.util.List<WeatherVariable> weatherVariablesList) {
        this.weatherVariablesList = weatherVariablesList;
        return this;
    }
    public java.util.List<WeatherVariable> getWeatherVariablesList() {
        return this.weatherVariablesList;
    }

    public QueryWeatherForecastResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
