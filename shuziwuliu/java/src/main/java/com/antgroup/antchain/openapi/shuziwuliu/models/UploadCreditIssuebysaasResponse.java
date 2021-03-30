// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditIssuebysaasResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批次id
    @NameInMap("batch_id")
    public String batchId;

    // 批次状态
    @NameInMap("batch_status")
    public Long batchStatus;

    // 发行url
    @NameInMap("issue_url")
    public String issueUrl;

    public static UploadCreditIssuebysaasResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditIssuebysaasResponse self = new UploadCreditIssuebysaasResponse();
        return TeaModel.build(map, self);
    }

    public UploadCreditIssuebysaasResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadCreditIssuebysaasResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadCreditIssuebysaasResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadCreditIssuebysaasResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public UploadCreditIssuebysaasResponse setBatchStatus(Long batchStatus) {
        this.batchStatus = batchStatus;
        return this;
    }
    public Long getBatchStatus() {
        return this.batchStatus;
    }

    public UploadCreditIssuebysaasResponse setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }
    public String getIssueUrl() {
        return this.issueUrl;
    }

}
