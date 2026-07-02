// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PreviewInnerFundmngbatchloanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  同意放款数量
    @NameInMap("agree_loan_count")
    public Long agreeLoanCount;

    // 拒绝放款数量
    @NameInMap("reject_loan_count")
    public Long rejectLoanCount;

    // 导入失败数量
    @NameInMap("import_fail_count")
    public Long importFailCount;

    // 预览结果文件
    @NameInMap("file_url")
    public String fileUrl;

    public static PreviewInnerFundmngbatchloanResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewInnerFundmngbatchloanResponse self = new PreviewInnerFundmngbatchloanResponse();
        return TeaModel.build(map, self);
    }

    public PreviewInnerFundmngbatchloanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PreviewInnerFundmngbatchloanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PreviewInnerFundmngbatchloanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PreviewInnerFundmngbatchloanResponse setAgreeLoanCount(Long agreeLoanCount) {
        this.agreeLoanCount = agreeLoanCount;
        return this;
    }
    public Long getAgreeLoanCount() {
        return this.agreeLoanCount;
    }

    public PreviewInnerFundmngbatchloanResponse setRejectLoanCount(Long rejectLoanCount) {
        this.rejectLoanCount = rejectLoanCount;
        return this;
    }
    public Long getRejectLoanCount() {
        return this.rejectLoanCount;
    }

    public PreviewInnerFundmngbatchloanResponse setImportFailCount(Long importFailCount) {
        this.importFailCount = importFailCount;
        return this;
    }
    public Long getImportFailCount() {
        return this.importFailCount;
    }

    public PreviewInnerFundmngbatchloanResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
