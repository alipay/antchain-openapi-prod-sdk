// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseLeasepromiseResponse extends TeaModel {
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

    // 用户端承诺
    @NameInMap("lease_promise_info")
    public java.util.List<LeasePromiseInfo> leasePromiseInfo;

    // 租期
    @NameInMap("pay_period")
    public Long payPeriod;

    // 租赁机构支付宝uid
    @NameInMap("lease_alipay_uid")
    public String leaseAlipayUid;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseLeasepromiseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseLeasepromiseResponse self = new QueryLeaseLeasepromiseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseLeasepromiseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseLeasepromiseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseLeasepromiseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseLeasepromiseResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseLeasepromiseResponse setLeasePromiseInfo(java.util.List<LeasePromiseInfo> leasePromiseInfo) {
        this.leasePromiseInfo = leasePromiseInfo;
        return this;
    }
    public java.util.List<LeasePromiseInfo> getLeasePromiseInfo() {
        return this.leasePromiseInfo;
    }

    public QueryLeaseLeasepromiseResponse setPayPeriod(Long payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }
    public Long getPayPeriod() {
        return this.payPeriod;
    }

    public QueryLeaseLeasepromiseResponse setLeaseAlipayUid(String leaseAlipayUid) {
        this.leaseAlipayUid = leaseAlipayUid;
        return this;
    }
    public String getLeaseAlipayUid() {
        return this.leaseAlipayUid;
    }

    public QueryLeaseLeasepromiseResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseLeasepromiseResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
