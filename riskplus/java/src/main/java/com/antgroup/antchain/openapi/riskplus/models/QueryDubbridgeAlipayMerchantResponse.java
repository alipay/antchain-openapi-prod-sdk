// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAlipayMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 入驻结果信息
    @NameInMap("sub_merchant_order")
    public SubMerchantOrder subMerchantOrder;

    public static QueryDubbridgeAlipayMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAlipayMerchantResponse self = new QueryDubbridgeAlipayMerchantResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAlipayMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeAlipayMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeAlipayMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeAlipayMerchantResponse setSubMerchantOrder(SubMerchantOrder subMerchantOrder) {
        this.subMerchantOrder = subMerchantOrder;
        return this;
    }
    public SubMerchantOrder getSubMerchantOrder() {
        return this.subMerchantOrder;
    }

}
