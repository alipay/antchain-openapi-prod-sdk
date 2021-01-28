// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SetLeaseRepaymentstatusResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 状态重置对应的链上交易哈希
    @NameInMap("response_data")
    public String responseData;

    // 状态码，0表示成功
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    public static SetLeaseRepaymentstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLeaseRepaymentstatusResponse self = new SetLeaseRepaymentstatusResponse();
        return TeaModel.build(map, self);
    }

    public SetLeaseRepaymentstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetLeaseRepaymentstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetLeaseRepaymentstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetLeaseRepaymentstatusResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

    public SetLeaseRepaymentstatusResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SetLeaseRepaymentstatusResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

}
