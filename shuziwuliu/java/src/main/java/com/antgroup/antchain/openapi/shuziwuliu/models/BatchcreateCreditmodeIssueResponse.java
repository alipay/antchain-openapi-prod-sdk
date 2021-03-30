// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class BatchcreateCreditmodeIssueResponse extends TeaModel {
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
    public String batchStatus;

    public static BatchcreateCreditmodeIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateCreditmodeIssueResponse self = new BatchcreateCreditmodeIssueResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateCreditmodeIssueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateCreditmodeIssueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateCreditmodeIssueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateCreditmodeIssueResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BatchcreateCreditmodeIssueResponse setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
        return this;
    }
    public String getBatchStatus() {
        return this.batchStatus;
    }

}
