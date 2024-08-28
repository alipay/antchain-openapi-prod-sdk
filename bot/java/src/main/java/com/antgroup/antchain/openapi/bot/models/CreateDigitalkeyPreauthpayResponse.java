// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDigitalkeyPreauthpayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // xxx
    @NameInMap("sub_code")
    public String subCode;

    // 子返回描述
    @NameInMap("sub_msg")
    public String subMsg;

    // 返回内容，json格式
    @NameInMap("data")
    public String data;

    public static CreateDigitalkeyPreauthpayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalkeyPreauthpayResponse self = new CreateDigitalkeyPreauthpayResponse();
        return TeaModel.build(map, self);
    }

    public CreateDigitalkeyPreauthpayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDigitalkeyPreauthpayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDigitalkeyPreauthpayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDigitalkeyPreauthpayResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateDigitalkeyPreauthpayResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public CreateDigitalkeyPreauthpayResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
