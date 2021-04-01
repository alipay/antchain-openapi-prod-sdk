// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantExchangeableequitydetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可兑换的商品详情信息
    @NameInMap("equity")
    public EquityDetail equity;

    public static QueryMerchantExchangeableequitydetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantExchangeableequitydetailResponse self = new QueryMerchantExchangeableequitydetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantExchangeableequitydetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantExchangeableequitydetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantExchangeableequitydetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantExchangeableequitydetailResponse setEquity(EquityDetail equity) {
        this.equity = equity;
        return this;
    }
    public EquityDetail getEquity() {
        return this.equity;
    }

}
