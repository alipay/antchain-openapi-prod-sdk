// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtworeviewdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 单个 L2 审核问题、证据与控制者结论
    @NameInMap("review")
    public LtwoReviewSummary review;

    public static QueryAntchainDasKyaLtworeviewdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtworeviewdetailResponse self = new QueryAntchainDasKyaLtworeviewdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtworeviewdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaLtworeviewdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaLtworeviewdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaLtworeviewdetailResponse setReview(LtwoReviewSummary review) {
        this.review = review;
        return this;
    }
    public LtwoReviewSummary getReview() {
        return this.review;
    }

}
