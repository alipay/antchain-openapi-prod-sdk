// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherAlertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次请求唯一标识，与入参一致。
    @NameInMap("request_id")
    public String requestId;

    // 本次查询额度消耗，十进制字符串，对应 Java BigDecimal；无预警的正常查询仍按现有服务规则计次。
    @NameInMap("quota_cost")
    public String quotaCost;

    // 当前生效的天气预警列表，元素为 WeatherAlert，对应 WeatherAlertDTO；无预警时为正常空列表。平台预警编码、发生确定性和时区时间按现有服务返回，不按普通气象时间序列展开。
    @NameInMap("alerts")
    public java.util.List<WeatherAlert> alerts;

    public static QueryWeatherAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherAlertResponse self = new QueryWeatherAlertResponse();
        return TeaModel.build(map, self);
    }

    public QueryWeatherAlertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWeatherAlertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWeatherAlertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWeatherAlertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherAlertResponse setQuotaCost(String quotaCost) {
        this.quotaCost = quotaCost;
        return this;
    }
    public String getQuotaCost() {
        return this.quotaCost;
    }

    public QueryWeatherAlertResponse setAlerts(java.util.List<WeatherAlert> alerts) {
        this.alerts = alerts;
        return this;
    }
    public java.util.List<WeatherAlert> getAlerts() {
        return this.alerts;
    }

}
