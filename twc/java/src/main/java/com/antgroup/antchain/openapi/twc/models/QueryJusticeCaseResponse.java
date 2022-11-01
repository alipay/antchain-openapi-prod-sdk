// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeCaseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 案件ID
    @NameInMap("case_id")
    public Long caseId;

    // 维权记录ID
    @NameInMap("record_id")
    public Long recordId;

    // 外部业务id
    @NameInMap("external_biz_id")
    public String externalBizId;

    // 案件阶段
    // 待发起维权
    // 待提交
    // 收案处理中
    // 结果待确认
    // 已关闭
    @NameInMap("case_phase_desc")
    public String casePhaseDesc;

    // 维权方式, (目前仅支持司法调解)
    // 诉讼-2
    // 仲裁-3
    // 仲裁执行-4
    // 司法调解-5
    @NameInMap("judicial_record_type_desc")
    public String judicialRecordTypeDesc;

    // 维权状态字段描述.
    // 
    @NameInMap("judicial_record_status_desc")
    public String judicialRecordStatusDesc;

    // "yyyy-MM-dd" , 当前的状态更新时间
    @NameInMap("judicial_record_status_time")
    public String judicialRecordStatusTime;

    // 维权过程中的文件列表
    @NameInMap("judicial_files")
    public java.util.List<JudicialFileInfo> judicialFiles;

    // 案件提交失败的原因,维权状态为提交失败时存在
    @NameInMap("submit_error_msg")
    public String submitErrorMsg;

    public static QueryJusticeCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeCaseResponse self = new QueryJusticeCaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryJusticeCaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryJusticeCaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryJusticeCaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryJusticeCaseResponse setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public QueryJusticeCaseResponse setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public QueryJusticeCaseResponse setExternalBizId(String externalBizId) {
        this.externalBizId = externalBizId;
        return this;
    }
    public String getExternalBizId() {
        return this.externalBizId;
    }

    public QueryJusticeCaseResponse setCasePhaseDesc(String casePhaseDesc) {
        this.casePhaseDesc = casePhaseDesc;
        return this;
    }
    public String getCasePhaseDesc() {
        return this.casePhaseDesc;
    }

    public QueryJusticeCaseResponse setJudicialRecordTypeDesc(String judicialRecordTypeDesc) {
        this.judicialRecordTypeDesc = judicialRecordTypeDesc;
        return this;
    }
    public String getJudicialRecordTypeDesc() {
        return this.judicialRecordTypeDesc;
    }

    public QueryJusticeCaseResponse setJudicialRecordStatusDesc(String judicialRecordStatusDesc) {
        this.judicialRecordStatusDesc = judicialRecordStatusDesc;
        return this;
    }
    public String getJudicialRecordStatusDesc() {
        return this.judicialRecordStatusDesc;
    }

    public QueryJusticeCaseResponse setJudicialRecordStatusTime(String judicialRecordStatusTime) {
        this.judicialRecordStatusTime = judicialRecordStatusTime;
        return this;
    }
    public String getJudicialRecordStatusTime() {
        return this.judicialRecordStatusTime;
    }

    public QueryJusticeCaseResponse setJudicialFiles(java.util.List<JudicialFileInfo> judicialFiles) {
        this.judicialFiles = judicialFiles;
        return this;
    }
    public java.util.List<JudicialFileInfo> getJudicialFiles() {
        return this.judicialFiles;
    }

    public QueryJusticeCaseResponse setSubmitErrorMsg(String submitErrorMsg) {
        this.submitErrorMsg = submitErrorMsg;
        return this;
    }
    public String getSubmitErrorMsg() {
        return this.submitErrorMsg;
    }

}
