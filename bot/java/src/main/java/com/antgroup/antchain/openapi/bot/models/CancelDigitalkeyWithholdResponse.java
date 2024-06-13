// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CancelDigitalkeyWithholdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回对象
    @NameInMap("antdigital_withhold_response")
    public AntdigitalWithHoldResponse antdigitalWithholdResponse;

    public static CancelDigitalkeyWithholdResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDigitalkeyWithholdResponse self = new CancelDigitalkeyWithholdResponse();
        return TeaModel.build(map, self);
    }

    public CancelDigitalkeyWithholdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelDigitalkeyWithholdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelDigitalkeyWithholdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelDigitalkeyWithholdResponse setAntdigitalWithholdResponse(AntdigitalWithHoldResponse antdigitalWithholdResponse) {
        this.antdigitalWithholdResponse = antdigitalWithholdResponse;
        return this;
    }
    public AntdigitalWithHoldResponse getAntdigitalWithholdResponse() {
        return this.antdigitalWithholdResponse;
    }

}
