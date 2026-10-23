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

    // 本次查询消耗的额度；内部数据链路成功查询固定消耗 1，MAYA 链路取下游返回值，可能为空。
    @NameInMap("quota_cost")
    public String quotaCost;

    // 实际返回的气象预测数据批次时间；数据链路未提供批次时可能为空。
    @NameInMap("forecast_batch_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String forecastBatchTime;

    // 气象预测数据列表，元素结构为WeatherVariable，包含variable_date（数据时间）、forecast_batch_time（预测批次时间）及按需返回的气象要素。完整可查询code及说明见本接口weather_variables入参。要素值为字符串，未请求或缺测时可能为空；weather_code为WMO数值码字符串，weather_type_code为原始整数天气码字符串。请求要素编码与出参字段名可能不同，例如请求temperature_2m时返回temperature2m，请求wind_speed_100m时返回wind_speed100m；出参名称以WeatherVariable结构体定义及实际响应为准。
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
