// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseCreditpromiseResponse extends TeaModel {
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

    // 融资租赁资方承诺列表
    @NameInMap("lease_credit_promise_info")
    public java.util.List<LeaseCreditPromiseInfo> leaseCreditPromiseInfo;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseCreditpromiseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseCreditpromiseResponse self = new QueryLeaseCreditpromiseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseCreditpromiseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseCreditpromiseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseCreditpromiseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseCreditpromiseResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseCreditpromiseResponse setLeaseCreditPromiseInfo(java.util.List<LeaseCreditPromiseInfo> leaseCreditPromiseInfo) {
        this.leaseCreditPromiseInfo = leaseCreditPromiseInfo;
        return this;
    }
    public java.util.List<LeaseCreditPromiseInfo> getLeaseCreditPromiseInfo() {
        return this.leaseCreditPromiseInfo;
    }

    public QueryLeaseCreditpromiseResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseCreditpromiseResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
