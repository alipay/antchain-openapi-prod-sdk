// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryPriceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品询价结果
    @NameInMap("commodity_enquiry_price")
    public CommodityEnquiryPrice commodityEnquiryPrice;

    public static QueryPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceResponse self = new QueryPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryPriceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPriceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPriceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPriceResponse setCommodityEnquiryPrice(CommodityEnquiryPrice commodityEnquiryPrice) {
        this.commodityEnquiryPrice = commodityEnquiryPrice;
        return this;
    }
    public CommodityEnquiryPrice getCommodityEnquiryPrice() {
        return this.commodityEnquiryPrice;
    }

}
