// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryStubResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数字票根存证全流程状态，FINISH(完结)、PROCESSING(上链中)、DISABLE(失效)、FAILED(失败)
    @NameInMap("status")
    public String status;

    // 阶段存证查询结果列表
    @NameInMap("phase_query_result_list")
    public java.util.List<PhaseQueryResult> phaseQueryResultList;

    // legal标URL，只有当入参needLegalLogo为true且响应status为FINISH时才会返回
    @NameInMap("legal_logo_url")
    public String legalLogoUrl;

    // 数字纪念票背面URL，只有当创建数字票根时写入了backType字段且响应status为FINISH时才会返回
    @NameInMap("stub_back_url")
    public String stubBackUrl;

    public static QueryStubResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStubResponse self = new QueryStubResponse();
        return TeaModel.build(map, self);
    }

    public QueryStubResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStubResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStubResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStubResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryStubResponse setPhaseQueryResultList(java.util.List<PhaseQueryResult> phaseQueryResultList) {
        this.phaseQueryResultList = phaseQueryResultList;
        return this;
    }
    public java.util.List<PhaseQueryResult> getPhaseQueryResultList() {
        return this.phaseQueryResultList;
    }

    public QueryStubResponse setLegalLogoUrl(String legalLogoUrl) {
        this.legalLogoUrl = legalLogoUrl;
        return this;
    }
    public String getLegalLogoUrl() {
        return this.legalLogoUrl;
    }

    public QueryStubResponse setStubBackUrl(String stubBackUrl) {
        this.stubBackUrl = stubBackUrl;
        return this;
    }
    public String getStubBackUrl() {
        return this.stubBackUrl;
    }

}
