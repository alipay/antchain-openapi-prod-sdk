// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtworeviewsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // L2 待审核问题及历史结论列表
    @NameInMap("reviews")
    public java.util.List<LtwoReviewSummary> reviews;

    // 查询元信息 JSON：version=2；period、scene_id、session_id、status 为实际筛选条件；session_count 等为去重全量统计；session_total/review_total 与 has_more 为分页信息；scope、time_basis 标明保留范围与当前状态口径
    @NameInMap("query_meta_json")
    public String queryMetaJson;

    public static QueryAntchainDasKyaLtworeviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtworeviewsResponse self = new QueryAntchainDasKyaLtworeviewsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtworeviewsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaLtworeviewsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaLtworeviewsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaLtworeviewsResponse setReviews(java.util.List<LtwoReviewSummary> reviews) {
        this.reviews = reviews;
        return this;
    }
    public java.util.List<LtwoReviewSummary> getReviews() {
        return this.reviews;
    }

    public QueryAntchainDasKyaLtworeviewsResponse setQueryMetaJson(String queryMetaJson) {
        this.queryMetaJson = queryMetaJson;
        return this;
    }
    public String getQueryMetaJson() {
        return this.queryMetaJson;
    }

}
