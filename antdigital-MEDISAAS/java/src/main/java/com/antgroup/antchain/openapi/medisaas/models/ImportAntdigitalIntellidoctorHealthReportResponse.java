// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.medisaas.models;

import com.aliyun.tea.*;

public class ImportAntdigitalIntellidoctorHealthReportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功接收入库的数据条数
    @NameInMap("accepted")
    public Long accepted;

    // 校验不通过被拒绝条数
    @NameInMap("rejected")
    public Long rejected;

    // 拒绝明细列表（仅 rejected > 0 时返回）
    @NameInMap("errors")
    public String errors;

    public static ImportAntdigitalIntellidoctorHealthReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAntdigitalIntellidoctorHealthReportResponse self = new ImportAntdigitalIntellidoctorHealthReportResponse();
        return TeaModel.build(map, self);
    }

    public ImportAntdigitalIntellidoctorHealthReportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportAntdigitalIntellidoctorHealthReportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportAntdigitalIntellidoctorHealthReportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportAntdigitalIntellidoctorHealthReportResponse setAccepted(Long accepted) {
        this.accepted = accepted;
        return this;
    }
    public Long getAccepted() {
        return this.accepted;
    }

    public ImportAntdigitalIntellidoctorHealthReportResponse setRejected(Long rejected) {
        this.rejected = rejected;
        return this;
    }
    public Long getRejected() {
        return this.rejected;
    }

    public ImportAntdigitalIntellidoctorHealthReportResponse setErrors(String errors) {
        this.errors = errors;
        return this;
    }
    public String getErrors() {
        return this.errors;
    }

}
