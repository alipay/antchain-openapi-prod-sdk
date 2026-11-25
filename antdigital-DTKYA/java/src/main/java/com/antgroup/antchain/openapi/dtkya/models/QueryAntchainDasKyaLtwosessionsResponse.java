// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtwosessionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 最近 Session 的 L2 状态与行为评分列表
    @NameInMap("sessions")
    public java.util.List<LtwoSessionSummary> sessions;

    // 查询元信息 JSON：version=2；period、scene_id、session_id、status 为实际筛选条件；session_count 等为去重全量统计；session_total/review_total 与 has_more 为分页信息；scope、time_basis 标明保留范围与当前状态口径
    @NameInMap("query_meta_json")
    public String queryMetaJson;

    public static QueryAntchainDasKyaLtwosessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtwosessionsResponse self = new QueryAntchainDasKyaLtwosessionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtwosessionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaLtwosessionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaLtwosessionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaLtwosessionsResponse setSessions(java.util.List<LtwoSessionSummary> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<LtwoSessionSummary> getSessions() {
        return this.sessions;
    }

    public QueryAntchainDasKyaLtwosessionsResponse setQueryMetaJson(String queryMetaJson) {
        this.queryMetaJson = queryMetaJson;
        return this;
    }
    public String getQueryMetaJson() {
        return this.queryMetaJson;
    }

}
