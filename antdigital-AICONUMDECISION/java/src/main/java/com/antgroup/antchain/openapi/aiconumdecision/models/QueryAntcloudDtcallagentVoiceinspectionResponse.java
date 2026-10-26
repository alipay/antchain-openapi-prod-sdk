// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class QueryAntcloudDtcallagentVoiceinspectionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // qc_record_id
    @NameInMap("qc_record_id")
    public String qcRecordId;

    // 异步任务状态，如 PROCESSING、COMPLETED、FAILED
    @NameInMap("status")
    public String status;

    // 100 分制总分
    @NameInMap("total_score")
    public Long totalScore;

    // result
    @NameInMap("result")
    public String result;

    // 质检规则命中明细
    @NameInMap("checklist")
    public java.util.List<String> checklist;

    public static QueryAntcloudDtcallagentVoiceinspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudDtcallagentVoiceinspectionResponse self = new QueryAntcloudDtcallagentVoiceinspectionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setQcRecordId(String qcRecordId) {
        this.qcRecordId = qcRecordId;
        return this;
    }
    public String getQcRecordId() {
        return this.qcRecordId;
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setTotalScore(Long totalScore) {
        this.totalScore = totalScore;
        return this;
    }
    public Long getTotalScore() {
        return this.totalScore;
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryAntcloudDtcallagentVoiceinspectionResponse setChecklist(java.util.List<String> checklist) {
        this.checklist = checklist;
        return this;
    }
    public java.util.List<String> getChecklist() {
        return this.checklist;
    }

}
