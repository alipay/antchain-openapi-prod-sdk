// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseClearingResponse extends TeaModel {
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

    // 融资租赁清分信息
    @NameInMap("cleearing_infos")
    public java.util.List<LeaseClearingInfo> cleearingInfos;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseClearingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseClearingResponse self = new QueryLeaseClearingResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseClearingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseClearingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseClearingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseClearingResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseClearingResponse setCleearingInfos(java.util.List<LeaseClearingInfo> cleearingInfos) {
        this.cleearingInfos = cleearingInfos;
        return this;
    }
    public java.util.List<LeaseClearingInfo> getCleearingInfos() {
        return this.cleearingInfos;
    }

    public QueryLeaseClearingResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseClearingResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
