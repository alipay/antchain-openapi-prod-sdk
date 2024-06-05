// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RefuseDigitalkeyWithholdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 明细返回码
    @NameInMap("sub_code")
    public String subCode;

    // 明细返回码描述
    @NameInMap("sub_msg")
    public String subMsg;

    // 退款返回信息 
    @NameInMap("data")
    public String data;

    public static RefuseDigitalkeyWithholdResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseDigitalkeyWithholdResponse self = new RefuseDigitalkeyWithholdResponse();
        return TeaModel.build(map, self);
    }

    public RefuseDigitalkeyWithholdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RefuseDigitalkeyWithholdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RefuseDigitalkeyWithholdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RefuseDigitalkeyWithholdResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RefuseDigitalkeyWithholdResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public RefuseDigitalkeyWithholdResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
