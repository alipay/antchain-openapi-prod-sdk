// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherShorttermrainResponse extends TeaModel {
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

    // 本次查询消耗的额度，十进制字符串；按现有短临降水服务规则独立计量。
    @NameInMap("quota_cost")
    public String quotaCost;

    // 短临降水预报列表，元素为 WeatherShortTermRain，对应 WeatherShortTermRainDTO；无可用预报时正常返回空列表，各项包含预报时间、降水量和降水类型。
    @NameInMap("short_term_rains")
    public java.util.List<WeatherShortTermRain> shortTermRains;

    public static QueryWeatherShorttermrainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherShorttermrainResponse self = new QueryWeatherShorttermrainResponse();
        return TeaModel.build(map, self);
    }

    public QueryWeatherShorttermrainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWeatherShorttermrainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWeatherShorttermrainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWeatherShorttermrainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherShorttermrainResponse setQuotaCost(String quotaCost) {
        this.quotaCost = quotaCost;
        return this;
    }
    public String getQuotaCost() {
        return this.quotaCost;
    }

    public QueryWeatherShorttermrainResponse setShortTermRains(java.util.List<WeatherShortTermRain> shortTermRains) {
        this.shortTermRains = shortTermRains;
        return this;
    }
    public java.util.List<WeatherShortTermRain> getShortTermRains() {
        return this.shortTermRains;
    }

}
