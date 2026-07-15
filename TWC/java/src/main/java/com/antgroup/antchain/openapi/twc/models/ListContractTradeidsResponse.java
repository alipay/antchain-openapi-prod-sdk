// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ListContractTradeidsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 0表示成功
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    // 所有item的个数
    @NameInMap("total")
    public Long total;

    // 所有满足条件的订单
    @NameInMap("out_trade_no")
    public java.util.List<String> outTradeNo;

    public static ListContractTradeidsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContractTradeidsResponse self = new ListContractTradeidsResponse();
        return TeaModel.build(map, self);
    }

    public ListContractTradeidsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListContractTradeidsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListContractTradeidsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListContractTradeidsResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListContractTradeidsResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListContractTradeidsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListContractTradeidsResponse setOutTradeNo(java.util.List<String> outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public java.util.List<String> getOutTradeNo() {
        return this.outTradeNo;
    }

}
