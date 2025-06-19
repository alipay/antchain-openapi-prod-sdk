// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsOrgtraderangeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易区间统计
    @NameInMap("data")
    public java.util.List<TradeRangeData> data;

    public static QueryStatisticsOrgtraderangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsOrgtraderangeResponse self = new QueryStatisticsOrgtraderangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsOrgtraderangeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStatisticsOrgtraderangeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStatisticsOrgtraderangeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStatisticsOrgtraderangeResponse setData(java.util.List<TradeRangeData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TradeRangeData> getData() {
        return this.data;
    }

}
