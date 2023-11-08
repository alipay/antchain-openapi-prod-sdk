// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryNftOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单状态
    @NameInMap("external_order")
    public ExternalOrderDTO externalOrder;

    public static QueryNftOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNftOrderResponse self = new QueryNftOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryNftOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNftOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNftOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNftOrderResponse setExternalOrder(ExternalOrderDTO externalOrder) {
        this.externalOrder = externalOrder;
        return this;
    }
    public ExternalOrderDTO getExternalOrder() {
        return this.externalOrder;
    }

}
