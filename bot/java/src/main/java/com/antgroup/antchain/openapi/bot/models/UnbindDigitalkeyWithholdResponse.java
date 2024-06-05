// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UnbindDigitalkeyWithholdResponse extends TeaModel {
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

    public static UnbindDigitalkeyWithholdResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDigitalkeyWithholdResponse self = new UnbindDigitalkeyWithholdResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDigitalkeyWithholdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnbindDigitalkeyWithholdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnbindDigitalkeyWithholdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnbindDigitalkeyWithholdResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public UnbindDigitalkeyWithholdResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
