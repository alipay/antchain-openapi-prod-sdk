// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ListContractOuttradeidResponse extends TeaModel {
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

    // 总符合条件的交易个数
    @NameInMap("total")
    public Long total;

    // 所有符合条件交易相关的id
    @NameInMap("out_trade_no")
    public java.util.List<String> outTradeNo;

    public static ListContractOuttradeidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContractOuttradeidResponse self = new ListContractOuttradeidResponse();
        return TeaModel.build(map, self);
    }

    public ListContractOuttradeidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListContractOuttradeidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListContractOuttradeidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListContractOuttradeidResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListContractOuttradeidResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListContractOuttradeidResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListContractOuttradeidResponse setOutTradeNo(java.util.List<String> outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public java.util.List<String> getOutTradeNo() {
        return this.outTradeNo;
    }

}
