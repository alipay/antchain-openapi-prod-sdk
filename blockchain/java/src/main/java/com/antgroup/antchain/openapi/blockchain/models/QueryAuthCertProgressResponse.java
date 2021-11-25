// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCertProgressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批量颁发的任务进度
    @NameInMap("cert_issue_progress")
    public CertIssueProgressDTO certIssueProgress;

    public static QueryAuthCertProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCertProgressResponse self = new QueryAuthCertProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthCertProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthCertProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthCertProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthCertProgressResponse setCertIssueProgress(CertIssueProgressDTO certIssueProgress) {
        this.certIssueProgress = certIssueProgress;
        return this;
    }
    public CertIssueProgressDTO getCertIssueProgress() {
        return this.certIssueProgress;
    }

}
