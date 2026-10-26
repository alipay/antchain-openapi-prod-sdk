// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class ExecuteAntcloudDtcallagentVoiceinspectionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 质检记录 ID
    @NameInMap("qc_record_id")
    public String qcRecordId;

    // ACCEPTED 表示异步任务已受理
    @NameInMap("status")
    public String status;

    // 本次提交的批次 ID
    @NameInMap("batch_id")
    public String batchId;

    // 外部通话唯一标识
    @NameInMap("external_call_id")
    public String externalCallId;

    public static ExecuteAntcloudDtcallagentVoiceinspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAntcloudDtcallagentVoiceinspectionResponse self = new ExecuteAntcloudDtcallagentVoiceinspectionResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionResponse setQcRecordId(String qcRecordId) {
        this.qcRecordId = qcRecordId;
        return this;
    }
    public String getQcRecordId() {
        return this.qcRecordId;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public ExecuteAntcloudDtcallagentVoiceinspectionResponse setExternalCallId(String externalCallId) {
        this.externalCallId = externalCallId;
        return this;
    }
    public String getExternalCallId() {
        return this.externalCallId;
    }

}
