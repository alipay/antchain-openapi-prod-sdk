// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelContractPaysingletradeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误码，0表示成功
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    // 被取消的某一期代扣订单id
    @NameInMap("canceled_out_trade_no")
    public String canceledOutTradeNo;

    public static CancelContractPaysingletradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelContractPaysingletradeResponse self = new CancelContractPaysingletradeResponse();
        return TeaModel.build(map, self);
    }

    public CancelContractPaysingletradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelContractPaysingletradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelContractPaysingletradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelContractPaysingletradeResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CancelContractPaysingletradeResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CancelContractPaysingletradeResponse setCanceledOutTradeNo(String canceledOutTradeNo) {
        this.canceledOutTradeNo = canceledOutTradeNo;
        return this;
    }
    public String getCanceledOutTradeNo() {
        return this.canceledOutTradeNo;
    }

}
