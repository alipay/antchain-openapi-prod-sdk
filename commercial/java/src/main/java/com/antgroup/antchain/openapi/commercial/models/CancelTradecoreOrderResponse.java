// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CancelTradecoreOrderResponse extends TeaModel {
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

    public static CancelTradecoreOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTradecoreOrderResponse self = new CancelTradecoreOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelTradecoreOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelTradecoreOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelTradecoreOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelTradecoreOrderResponse setMainOrder(MainOrderVO mainOrder) {
        this.mainOrder = mainOrder;
        return this;
    }
    public MainOrderVO getMainOrder() {
        return this.mainOrder;
    }

}
