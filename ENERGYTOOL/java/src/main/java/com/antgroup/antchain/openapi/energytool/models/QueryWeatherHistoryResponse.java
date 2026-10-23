// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherHistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次请求唯一标识，与入参 request_id 一致。
    @NameInMap("request_id")
    public String requestId;

    // 本次查询消耗的额度，十进制字符串；成功查询按现有服务规则计量。
    @NameInMap("quota_cost")
    public String quotaCost;

    // 历史实测气象数据列表，元素为 WeatherActualVariable；按 15 分钟时间点返回，仅填充所选的 20 个支持要素，值为 String，缺测时可为空，不返回预测批次。
    @NameInMap("weather_variables_list")
    public java.util.List<WeatherActualVariable> weatherVariablesList;

    public static QueryWeatherHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherHistoryResponse self = new QueryWeatherHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryWeatherHistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWeatherHistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWeatherHistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWeatherHistoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherHistoryResponse setQuotaCost(String quotaCost) {
        this.quotaCost = quotaCost;
        return this;
    }
    public String getQuotaCost() {
        return this.quotaCost;
    }

    public QueryWeatherHistoryResponse setWeatherVariablesList(java.util.List<WeatherActualVariable> weatherVariablesList) {
        this.weatherVariablesList = weatherVariablesList;
        return this;
    }
    public java.util.List<WeatherActualVariable> getWeatherVariablesList() {
        return this.weatherVariablesList;
    }

}
