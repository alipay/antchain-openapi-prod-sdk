// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetAiidentificationQrcodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求id
    @NameInMap("request_id")
    public String requestId;

    // 返回码
    @NameInMap("code")
    public String code;

    // 返回信息
    @NameInMap("message")
    public String message;

    // 二维码识别结果
    @NameInMap("data")
    public BaiQrcodeParseRespData data;

    public static GetAiidentificationQrcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiidentificationQrcodeResponse self = new GetAiidentificationQrcodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAiidentificationQrcodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAiidentificationQrcodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAiidentificationQrcodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAiidentificationQrcodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiidentificationQrcodeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiidentificationQrcodeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiidentificationQrcodeResponse setData(BaiQrcodeParseRespData data) {
        this.data = data;
        return this;
    }
    public BaiQrcodeParseRespData getData() {
        return this.data;
    }

}
