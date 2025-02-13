// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListSimOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页器
    @NameInMap("paginator")
    public Paginator paginator;

    // 订单信息列表
    @NameInMap("order_info_list")
    public java.util.List<SimOrderInfo> orderInfoList;

    public static ListSimOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSimOrderResponse self = new ListSimOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListSimOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSimOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSimOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSimOrderResponse setPaginator(Paginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public Paginator getPaginator() {
        return this.paginator;
    }

    public ListSimOrderResponse setOrderInfoList(java.util.List<SimOrderInfo> orderInfoList) {
        this.orderInfoList = orderInfoList;
        return this;
    }
    public java.util.List<SimOrderInfo> getOrderInfoList() {
        return this.orderInfoList;
    }

}
