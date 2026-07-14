// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherWarningResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 气象预警信息
    @NameInMap("warning_info")
    public java.util.List<WeatherWarningData> warningInfo;

    public static QueryWeatherWarningResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherWarningResponse self = new QueryWeatherWarningResponse();
        return TeaModel.build(map, self);
    }

    public QueryWeatherWarningResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWeatherWarningResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWeatherWarningResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWeatherWarningResponse setWarningInfo(java.util.List<WeatherWarningData> warningInfo) {
        this.warningInfo = warningInfo;
        return this;
    }
    public java.util.List<WeatherWarningData> getWarningInfo() {
        return this.warningInfo;
    }

}
