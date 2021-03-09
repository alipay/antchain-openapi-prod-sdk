// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerAgentsetupcommandResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // operation tasks
    @NameInMap("results")
    public java.util.List<OperationTask> results;

    public static QueryComputerAgentsetupcommandResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerAgentsetupcommandResponse self = new QueryComputerAgentsetupcommandResponse();
        return TeaModel.build(map, self);
    }

    public QueryComputerAgentsetupcommandResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryComputerAgentsetupcommandResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryComputerAgentsetupcommandResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryComputerAgentsetupcommandResponse setResults(java.util.List<OperationTask> results) {
        this.results = results;
        return this;
    }
    public java.util.List<OperationTask> getResults() {
        return this.results;
    }

}
