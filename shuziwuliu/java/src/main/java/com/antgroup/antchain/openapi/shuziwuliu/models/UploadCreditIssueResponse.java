// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditIssueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批次号
    @NameInMap("batch_id")
    public String batchId;

    // 批次状态
    @NameInMap("batch_id_status")
    public Long batchIdStatus;

    // 发行url
    @NameInMap("issue_url")
    public String issueUrl;

    public static UploadCreditIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditIssueResponse self = new UploadCreditIssueResponse();
        return TeaModel.build(map, self);
    }

    public UploadCreditIssueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadCreditIssueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadCreditIssueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadCreditIssueResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public UploadCreditIssueResponse setBatchIdStatus(Long batchIdStatus) {
        this.batchIdStatus = batchIdStatus;
        return this;
    }
    public Long getBatchIdStatus() {
        return this.batchIdStatus;
    }

    public UploadCreditIssueResponse setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }
    public String getIssueUrl() {
        return this.issueUrl;
    }

}
