// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelContractPaytradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误码
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    // 取消的代扣条目
    @NameInMap("canceled_out_trade_no")
    public java.util.List<String> canceledOutTradeNo;

    public static CancelContractPaytradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelContractPaytradeResponse self = new CancelContractPaytradeResponse();
        return TeaModel.build(map, self);
    }

    public CancelContractPaytradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelContractPaytradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelContractPaytradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelContractPaytradeResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CancelContractPaytradeResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CancelContractPaytradeResponse setCanceledOutTradeNo(java.util.List<String> canceledOutTradeNo) {
        this.canceledOutTradeNo = canceledOutTradeNo;
        return this;
    }
    public java.util.List<String> getCanceledOutTradeNo() {
        return this.canceledOutTradeNo;
    }

}
