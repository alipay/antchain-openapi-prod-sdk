// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ListContractDeductorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代扣期数列表
    @NameInMap("order_list")
    public java.util.List<DeductOrderInfo> orderList;

    public static ListContractDeductorderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContractDeductorderResponse self = new ListContractDeductorderResponse();
        return TeaModel.build(map, self);
    }

    public ListContractDeductorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListContractDeductorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListContractDeductorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListContractDeductorderResponse setOrderList(java.util.List<DeductOrderInfo> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<DeductOrderInfo> getOrderList() {
        return this.orderList;
    }

}
