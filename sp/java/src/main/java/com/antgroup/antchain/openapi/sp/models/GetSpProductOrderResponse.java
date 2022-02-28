// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class GetSpProductOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("order_results")
    @Validation(required = true)
    public java.util.List<OrderResult> orderResults;

    public static GetSpProductOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpProductOrderResponse self = new GetSpProductOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetSpProductOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSpProductOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSpProductOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSpProductOrderResponse setOrderResults(java.util.List<OrderResult> orderResults) {
        this.orderResults = orderResults;
        return this;
    }
    public java.util.List<OrderResult> getOrderResults() {
        return this.orderResults;
    }

}
