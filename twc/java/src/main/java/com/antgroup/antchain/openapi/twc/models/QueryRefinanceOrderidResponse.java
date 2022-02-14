// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryRefinanceOrderidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单id列表
    @NameInMap("order_info_list")
    public java.util.List<RefinanceOrderInfoResponse> orderInfoList;

    public static QueryRefinanceOrderidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRefinanceOrderidResponse self = new QueryRefinanceOrderidResponse();
        return TeaModel.build(map, self);
    }

    public QueryRefinanceOrderidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRefinanceOrderidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRefinanceOrderidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRefinanceOrderidResponse setOrderInfoList(java.util.List<RefinanceOrderInfoResponse> orderInfoList) {
        this.orderInfoList = orderInfoList;
        return this;
    }
    public java.util.List<RefinanceOrderInfoResponse> getOrderInfoList() {
        return this.orderInfoList;
    }

}
