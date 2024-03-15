// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryWithholdActivepayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前支付单
    @NameInMap("current_order")
    public ActivePayOrder currentOrder;

    // 主动支付单列表，当不通过trade_no查询时有值
    @NameInMap("orders")
    public java.util.List<ActivePayOrder> orders;

    public static QueryWithholdActivepayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdActivepayResponse self = new QueryWithholdActivepayResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdActivepayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWithholdActivepayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWithholdActivepayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWithholdActivepayResponse setCurrentOrder(ActivePayOrder currentOrder) {
        this.currentOrder = currentOrder;
        return this;
    }
    public ActivePayOrder getCurrentOrder() {
        return this.currentOrder;
    }

    public QueryWithholdActivepayResponse setOrders(java.util.List<ActivePayOrder> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<ActivePayOrder> getOrders() {
        return this.orders;
    }

}
