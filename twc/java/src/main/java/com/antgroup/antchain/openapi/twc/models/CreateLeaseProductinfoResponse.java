// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseProductinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码 0表示成功
    @NameInMap("code")
    public Long code;

    // 错误信息
    @NameInMap("err_message")
    public String errMessage;

    // 用户信息存储到合约中对应的区块链交易哈希
    @NameInMap("response_data")
    public String responseData;

    public static CreateLeaseProductinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseProductinfoResponse self = new CreateLeaseProductinfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateLeaseProductinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateLeaseProductinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLeaseProductinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateLeaseProductinfoResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateLeaseProductinfoResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateLeaseProductinfoResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

}
