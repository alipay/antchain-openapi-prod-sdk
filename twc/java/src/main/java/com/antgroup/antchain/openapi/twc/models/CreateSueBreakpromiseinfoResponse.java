// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateSueBreakpromiseinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 成功插入违约数据到区块链的交易哈希
    @NameInMap("response_data")
    public String responseData;

    // 状态码,0表示成功
    // 
    @NameInMap("code")
    public String code;

    // 错误信息
    @NameInMap("err_message")
    public String errMessage;

    public static CreateSueBreakpromiseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSueBreakpromiseinfoResponse self = new CreateSueBreakpromiseinfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateSueBreakpromiseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSueBreakpromiseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSueBreakpromiseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSueBreakpromiseinfoResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

    public CreateSueBreakpromiseinfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSueBreakpromiseinfoResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

}
