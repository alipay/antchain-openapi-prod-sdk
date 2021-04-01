// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionOrderRakebackResponse extends TeaModel {
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

    // 返佣信息列表
    @NameInMap("rakeback_list")
    public java.util.List<RakeBackInfo> rakebackList;

    public static QueryDistributionOrderRakebackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionOrderRakebackResponse self = new QueryDistributionOrderRakebackResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionOrderRakebackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributionOrderRakebackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributionOrderRakebackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributionOrderRakebackResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDistributionOrderRakebackResponse setRakebackList(java.util.List<RakeBackInfo> rakebackList) {
        this.rakebackList = rakebackList;
        return this;
    }
    public java.util.List<RakeBackInfo> getRakebackList() {
        return this.rakebackList;
    }

}
