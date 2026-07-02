// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetFundOrderfulfillmentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单履约信息的列表数组
    // List<OrderFulfillment> 的jsonArray.toString
    @NameInMap("order_fulfillment_data_list")
    public String orderFulfillmentDataList;

    public static GetFundOrderfulfillmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundOrderfulfillmentResponse self = new GetFundOrderfulfillmentResponse();
        return TeaModel.build(map, self);
    }

    public GetFundOrderfulfillmentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFundOrderfulfillmentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFundOrderfulfillmentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFundOrderfulfillmentResponse setOrderFulfillmentDataList(String orderFulfillmentDataList) {
        this.orderFulfillmentDataList = orderFulfillmentDataList;
        return this;
    }
    public String getOrderFulfillmentDataList() {
        return this.orderFulfillmentDataList;
    }

}
