// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryElectricMarketpriceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回记录总数
    @NameInMap("total_count")
    public Long totalCount;

    // 市场价格列表
    @NameInMap("data")
    public java.util.List<MarketPrice> data;

    public static QueryElectricMarketpriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectricMarketpriceResponse self = new QueryElectricMarketpriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectricMarketpriceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectricMarketpriceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectricMarketpriceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectricMarketpriceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryElectricMarketpriceResponse setData(java.util.List<MarketPrice> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MarketPrice> getData() {
        return this.data;
    }

}
