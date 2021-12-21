// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpOrderhistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单列表
    @NameInMap("order_list")
    public java.util.List<IPOrder> orderList;

    public static QueryIpOrderhistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpOrderhistoryResponse self = new QueryIpOrderhistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpOrderhistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpOrderhistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpOrderhistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpOrderhistoryResponse setOrderList(java.util.List<IPOrder> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<IPOrder> getOrderList() {
        return this.orderList;
    }

}
