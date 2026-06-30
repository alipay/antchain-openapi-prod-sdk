// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbCompanyGuardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 决策结果，ACCEPT/REJECT/TBD
    // 
    @NameInMap("decision")
    public String decision;

    // 准入执行结果的快照
    // 
    @NameInMap("results")
    public String results;

    public static QueryRbbCompanyGuardResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbCompanyGuardResponse self = new QueryRbbCompanyGuardResponse();
        return TeaModel.build(map, self);
    }

    public QueryRbbCompanyGuardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRbbCompanyGuardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRbbCompanyGuardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRbbCompanyGuardResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public QueryRbbCompanyGuardResponse setResults(String results) {
        this.results = results;
        return this;
    }
    public String getResults() {
        return this.results;
    }

}
