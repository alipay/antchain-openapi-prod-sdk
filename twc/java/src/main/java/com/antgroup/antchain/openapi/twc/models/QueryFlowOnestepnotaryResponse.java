// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryFlowOnestepnotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证全流程状态，FINISH(完结)、PROCESSING(上链中)、DISABLE(失效)、FAILED(失败)
    @NameInMap("status")
    public String status;

    // 阶段存证查询结果列表
    @NameInMap("phase_query_result_list")
    public java.util.List<PhaseQueryResult> phaseQueryResultList;

    public static QueryFlowOnestepnotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowOnestepnotaryResponse self = new QueryFlowOnestepnotaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowOnestepnotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowOnestepnotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowOnestepnotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowOnestepnotaryResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryFlowOnestepnotaryResponse setPhaseQueryResultList(java.util.List<PhaseQueryResult> phaseQueryResultList) {
        this.phaseQueryResultList = phaseQueryResultList;
        return this;
    }
    public java.util.List<PhaseQueryResult> getPhaseQueryResultList() {
        return this.phaseQueryResultList;
    }

}
