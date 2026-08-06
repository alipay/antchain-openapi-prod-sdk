// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMermngcontractauditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 审核id
    @NameInMap("audit_id")
    public String auditId;

    // PROCESSING
    // SUCCESS
    // FAIL
    // FINALIZED
    @NameInMap("status")
    public String status;

    // 审核结果
    @NameInMap("result")
    public String result;

    public static QueryInnerMermngcontractauditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMermngcontractauditResponse self = new QueryInnerMermngcontractauditResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerMermngcontractauditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerMermngcontractauditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerMermngcontractauditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerMermngcontractauditResponse setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public QueryInnerMermngcontractauditResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInnerMermngcontractauditResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
