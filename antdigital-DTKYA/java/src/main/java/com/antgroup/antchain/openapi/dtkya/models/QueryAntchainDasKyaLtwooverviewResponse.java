// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtwooverviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 按场景汇总的 L2 状态列表
    @NameInMap("scenes")
    public java.util.List<LtwoSceneOverview> scenes;

    // 查询元信息 JSON：version=2；period、scene_id、session_id、status 为实际筛选条件；session_count 等为去重全量统计；session_total/review_total 与 has_more 为分页信息；scope、time_basis 标明保留数据范围与当前状态口径
    @NameInMap("query_meta_json")
    public String queryMetaJson;

    public static QueryAntchainDasKyaLtwooverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtwooverviewResponse self = new QueryAntchainDasKyaLtwooverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtwooverviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaLtwooverviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaLtwooverviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaLtwooverviewResponse setScenes(java.util.List<LtwoSceneOverview> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<LtwoSceneOverview> getScenes() {
        return this.scenes;
    }

    public QueryAntchainDasKyaLtwooverviewResponse setQueryMetaJson(String queryMetaJson) {
        this.queryMetaJson = queryMetaJson;
        return this;
    }
    public String getQueryMetaJson() {
        return this.queryMetaJson;
    }

}
