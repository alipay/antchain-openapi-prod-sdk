// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseRentalinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 融资租赁订单id
    @NameInMap("order_id")
    public String orderId;

    // 用户侧还款信息
    @NameInMap("rental_infos")
    public java.util.List<LeaseRentalInfo> rentalInfos;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseRentalinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseRentalinfoResponse self = new QueryLeaseRentalinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseRentalinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseRentalinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseRentalinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseRentalinfoResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseRentalinfoResponse setRentalInfos(java.util.List<LeaseRentalInfo> rentalInfos) {
        this.rentalInfos = rentalInfos;
        return this;
    }
    public java.util.List<LeaseRentalInfo> getRentalInfos() {
        return this.rentalInfos;
    }

    public QueryLeaseRentalinfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseRentalinfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
