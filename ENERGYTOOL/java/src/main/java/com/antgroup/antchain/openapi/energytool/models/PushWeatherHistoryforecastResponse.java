// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class PushWeatherHistoryforecastResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已受理的原始请求 ID。提交成功只表示请求已受理，不表示文件已生成；相同 ID、相同条件重复提交复用原请求，使用此 ID 调用历史预测结果查询接口。
    @NameInMap("request_id")
    public String requestId;

    public static PushWeatherHistoryforecastResponse build(java.util.Map<String, ?> map) throws Exception {
        PushWeatherHistoryforecastResponse self = new PushWeatherHistoryforecastResponse();
        return TeaModel.build(map, self);
    }

    public PushWeatherHistoryforecastResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushWeatherHistoryforecastResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushWeatherHistoryforecastResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushWeatherHistoryforecastResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
