// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryBiddingspaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 竞价空间分析
    @NameInMap("bidding_analysis")
    public java.util.List<BiddingAnalysisData> biddingAnalysis;

    public static QueryBiddingspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBiddingspaceResponse self = new QueryBiddingspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryBiddingspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBiddingspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBiddingspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBiddingspaceResponse setBiddingAnalysis(java.util.List<BiddingAnalysisData> biddingAnalysis) {
        this.biddingAnalysis = biddingAnalysis;
        return this;
    }
    public java.util.List<BiddingAnalysisData> getBiddingAnalysis() {
        return this.biddingAnalysis;
    }

}
