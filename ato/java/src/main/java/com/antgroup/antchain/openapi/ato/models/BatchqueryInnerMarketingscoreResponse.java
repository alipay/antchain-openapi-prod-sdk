// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BatchqueryInnerMarketingscoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 营销分返回对象
    @NameInMap("marketing_score_info")
    public java.util.List<MarketingScoreInfo> marketingScoreInfo;

    public static BatchqueryInnerMarketingscoreResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryInnerMarketingscoreResponse self = new BatchqueryInnerMarketingscoreResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryInnerMarketingscoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryInnerMarketingscoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryInnerMarketingscoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryInnerMarketingscoreResponse setMarketingScoreInfo(java.util.List<MarketingScoreInfo> marketingScoreInfo) {
        this.marketingScoreInfo = marketingScoreInfo;
        return this;
    }
    public java.util.List<MarketingScoreInfo> getMarketingScoreInfo() {
        return this.marketingScoreInfo;
    }

}
