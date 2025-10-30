// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcallagent.models;

import com.aliyun.tea.*;

public class QueryVoiceserviceQuerycalldetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求状态码。
    // ● 返回 OK 代表请求成功。
    @NameInMap("code")
    public String code;

    // 状态码的描述。
    @NameInMap("message")
    public String message;

    // 返回的呼叫详情。JSON 格式。以下字段仅供参考，以具体返回详情为准。
    // ● caller：主叫号码。
    // ● startDate：通话开始时间。
    // ● stateDesc：通话状态描述。
    // ● duration：通话时长。单位：秒。0：用户未接通。
    // ● callerShowNumber：被叫显号。
    // ● gmtCreate：通话请求的接收时间。
    // ● state：通话状态。通话状态是运营商实时返回的，更多状态信息，请参见通话结果状态码。
    // ● endDate：通话结束时间。
    // ● calleeShowNumber：被叫显号。
    // ● callee：被叫号码。
    // ● aRingTime：a 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
    // ● aEndTime：a 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
    // （待确认）
    // ● bRingTime：b 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
    // ● bEndTime：b 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
    @NameInMap("data")
    public String data;

    // 本次调用请求的 ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。
    @NameInMap("request_id")
    public String requestId;

    public static QueryVoiceserviceQuerycalldetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceserviceQuerycalldetailResponse self = new QueryVoiceserviceQuerycalldetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryVoiceserviceQuerycalldetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryVoiceserviceQuerycalldetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryVoiceserviceQuerycalldetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryVoiceserviceQuerycalldetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVoiceserviceQuerycalldetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVoiceserviceQuerycalldetailResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryVoiceserviceQuerycalldetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
