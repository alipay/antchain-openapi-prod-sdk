// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseRepaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 租赁机构端还款信息
    @NameInMap("repayment_infos")
    public java.util.List<LeaseRepaymentInfo> repaymentInfos;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseRepaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseRepaymentResponse self = new QueryLeaseRepaymentResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseRepaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseRepaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseRepaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseRepaymentResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseRepaymentResponse setRepaymentInfos(java.util.List<LeaseRepaymentInfo> repaymentInfos) {
        this.repaymentInfos = repaymentInfos;
        return this;
    }
    public java.util.List<LeaseRepaymentInfo> getRepaymentInfos() {
        return this.repaymentInfos;
    }

    public QueryLeaseRepaymentResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseRepaymentResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
