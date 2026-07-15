// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryAheadrealtimePricecompareResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 电价对比点位
    @NameInMap("price_compare")
    public java.util.List<AheadRealtimePriceCompareData> priceCompare;

    public static QueryAheadrealtimePricecompareResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAheadrealtimePricecompareResponse self = new QueryAheadrealtimePricecompareResponse();
        return TeaModel.build(map, self);
    }

    public QueryAheadrealtimePricecompareResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAheadrealtimePricecompareResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAheadrealtimePricecompareResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAheadrealtimePricecompareResponse setPriceCompare(java.util.List<AheadRealtimePriceCompareData> priceCompare) {
        this.priceCompare = priceCompare;
        return this;
    }
    public java.util.List<AheadRealtimePriceCompareData> getPriceCompare() {
        return this.priceCompare;
    }

}
