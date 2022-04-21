// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twoe.models;

import com.aliyun.tea.*;

public class QueryEvidenceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // session编号
    @NameInMap("session_id")
    public String sessionId;

    // 取证状态
    @NameInMap("status")
    public String status;

    // 证据信息，只有当status为EVIDENCE时返回，否则为null
    @NameInMap("data")
    public EvidenceInfo data;

    public static QueryEvidenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEvidenceResponse self = new QueryEvidenceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEvidenceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEvidenceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEvidenceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEvidenceResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryEvidenceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryEvidenceResponse setData(EvidenceInfo data) {
        this.data = data;
        return this;
    }
    public EvidenceInfo getData() {
        return this.data;
    }

}
