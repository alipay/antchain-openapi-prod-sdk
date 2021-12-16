// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryTradecoreOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // main_order
    @NameInMap("main_order")
    public MainOrderVO mainOrder;

    public static QueryTradecoreOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradecoreOrderResponse self = new QueryTradecoreOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradecoreOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTradecoreOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTradecoreOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTradecoreOrderResponse setMainOrder(MainOrderVO mainOrder) {
        this.mainOrder = mainOrder;
        return this;
    }
    public MainOrderVO getMainOrder() {
        return this.mainOrder;
    }

}
