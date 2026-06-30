// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciRegistrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 废弃待删除
    @NameInMap("content_status")
    public String contentStatus;

    // 废弃待删除
    @NameInMap("register_cert_tx_hash")
    public String registerCertTxHash;

    // 废弃待删除
    @NameInMap("register_cert_block_height")
    public String registerCertBlockHeight;

    // 废弃待删除
    @NameInMap("register_cert_tsr")
    public String registerCertTsr;

    // 废弃待删除
    @NameInMap("register_cert_png_file_id")
    public String registerCertPngFileId;

    // 废弃待删除
    @NameInMap("register_sample_file_id")
    public String registerSampleFileId;

    // 废弃待删除
    @NameInMap("register_sample_png_file_id")
    public String registerSamplePngFileId;

    // 废弃待删除
    @NameInMap("register_download_times_left")
    public Long registerDownloadTimesLeft;

    // 废弃待删除
    @NameInMap("error_reason")
    public String errorReason;

    // 废弃待删除
    @NameInMap("error_reason_cn")
    public String errorReasonCn;

    // 废弃待删除
    @NameInMap("invoice_file_id_list")
    public java.util.List<String> invoiceFileIdList;

    // 废弃待删除
    @NameInMap("apply_register_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String applyRegisterTime;

    // 数登登记号
    @NameInMap("reg_number")
    public String regNumber;

    // 数登id
    @NameInMap("digital_register_id")
    public String digitalRegisterId;

    // dci申领id
    @NameInMap("dci_content_id")
    public String dciContentId;

    // 数登状态
    @NameInMap("digital_register_status")
    public String digitalRegisterStatus;

    // 数登申请时间
    @NameInMap("digital_register_apply_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String digitalRegisterApplyTime;

    // 数登完成时间
    @NameInMap("digital_register_completion_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String digitalRegisterCompletionTime;

    // 数登证书预览图url
    @NameInMap("digital_register_cert_png_url")
    public String digitalRegisterCertPngUrl;

    // 样本证书预览图url
    @NameInMap("digital_register_sample_png_url")
    public String digitalRegisterSamplePngUrl;

    // 证书本月剩余下载次数
    @NameInMap("download_times_left")
    public Long downloadTimesLeft;

    // 发票下载链接list
    @NameInMap("invoice_url_list")
    public java.util.List<String> invoiceUrlList;

    // 数登失败详情
    @NameInMap("fail_detail")
    public String failDetail;

    // 补正类型
    @NameInMap("amend_type")
    public String amendType;

    // 用户申请表url
    @NameInMap("apply_form_url")
    public String applyFormUrl;

    // 数登流水号
    @NameInMap("flow_number")
    public String flowNumber;

    public static QueryDciRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDciRegistrationResponse self = new QueryDciRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public QueryDciRegistrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDciRegistrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDciRegistrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDciRegistrationResponse setContentStatus(String contentStatus) {
        this.contentStatus = contentStatus;
        return this;
    }
    public String getContentStatus() {
        return this.contentStatus;
    }

    public QueryDciRegistrationResponse setRegisterCertTxHash(String registerCertTxHash) {
        this.registerCertTxHash = registerCertTxHash;
        return this;
    }
    public String getRegisterCertTxHash() {
        return this.registerCertTxHash;
    }

    public QueryDciRegistrationResponse setRegisterCertBlockHeight(String registerCertBlockHeight) {
        this.registerCertBlockHeight = registerCertBlockHeight;
        return this;
    }
    public String getRegisterCertBlockHeight() {
        return this.registerCertBlockHeight;
    }

    public QueryDciRegistrationResponse setRegisterCertTsr(String registerCertTsr) {
        this.registerCertTsr = registerCertTsr;
        return this;
    }
    public String getRegisterCertTsr() {
        return this.registerCertTsr;
    }

    public QueryDciRegistrationResponse setRegisterCertPngFileId(String registerCertPngFileId) {
        this.registerCertPngFileId = registerCertPngFileId;
        return this;
    }
    public String getRegisterCertPngFileId() {
        return this.registerCertPngFileId;
    }

    public QueryDciRegistrationResponse setRegisterSampleFileId(String registerSampleFileId) {
        this.registerSampleFileId = registerSampleFileId;
        return this;
    }
    public String getRegisterSampleFileId() {
        return this.registerSampleFileId;
    }

    public QueryDciRegistrationResponse setRegisterSamplePngFileId(String registerSamplePngFileId) {
        this.registerSamplePngFileId = registerSamplePngFileId;
        return this;
    }
    public String getRegisterSamplePngFileId() {
        return this.registerSamplePngFileId;
    }

    public QueryDciRegistrationResponse setRegisterDownloadTimesLeft(Long registerDownloadTimesLeft) {
        this.registerDownloadTimesLeft = registerDownloadTimesLeft;
        return this;
    }
    public Long getRegisterDownloadTimesLeft() {
        return this.registerDownloadTimesLeft;
    }

    public QueryDciRegistrationResponse setErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }
    public String getErrorReason() {
        return this.errorReason;
    }

    public QueryDciRegistrationResponse setErrorReasonCn(String errorReasonCn) {
        this.errorReasonCn = errorReasonCn;
        return this;
    }
    public String getErrorReasonCn() {
        return this.errorReasonCn;
    }

    public QueryDciRegistrationResponse setInvoiceFileIdList(java.util.List<String> invoiceFileIdList) {
        this.invoiceFileIdList = invoiceFileIdList;
        return this;
    }
    public java.util.List<String> getInvoiceFileIdList() {
        return this.invoiceFileIdList;
    }

    public QueryDciRegistrationResponse setApplyRegisterTime(String applyRegisterTime) {
        this.applyRegisterTime = applyRegisterTime;
        return this;
    }
    public String getApplyRegisterTime() {
        return this.applyRegisterTime;
    }

    public QueryDciRegistrationResponse setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public QueryDciRegistrationResponse setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public QueryDciRegistrationResponse setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public QueryDciRegistrationResponse setDigitalRegisterStatus(String digitalRegisterStatus) {
        this.digitalRegisterStatus = digitalRegisterStatus;
        return this;
    }
    public String getDigitalRegisterStatus() {
        return this.digitalRegisterStatus;
    }

    public QueryDciRegistrationResponse setDigitalRegisterApplyTime(String digitalRegisterApplyTime) {
        this.digitalRegisterApplyTime = digitalRegisterApplyTime;
        return this;
    }
    public String getDigitalRegisterApplyTime() {
        return this.digitalRegisterApplyTime;
    }

    public QueryDciRegistrationResponse setDigitalRegisterCompletionTime(String digitalRegisterCompletionTime) {
        this.digitalRegisterCompletionTime = digitalRegisterCompletionTime;
        return this;
    }
    public String getDigitalRegisterCompletionTime() {
        return this.digitalRegisterCompletionTime;
    }

    public QueryDciRegistrationResponse setDigitalRegisterCertPngUrl(String digitalRegisterCertPngUrl) {
        this.digitalRegisterCertPngUrl = digitalRegisterCertPngUrl;
        return this;
    }
    public String getDigitalRegisterCertPngUrl() {
        return this.digitalRegisterCertPngUrl;
    }

    public QueryDciRegistrationResponse setDigitalRegisterSamplePngUrl(String digitalRegisterSamplePngUrl) {
        this.digitalRegisterSamplePngUrl = digitalRegisterSamplePngUrl;
        return this;
    }
    public String getDigitalRegisterSamplePngUrl() {
        return this.digitalRegisterSamplePngUrl;
    }

    public QueryDciRegistrationResponse setDownloadTimesLeft(Long downloadTimesLeft) {
        this.downloadTimesLeft = downloadTimesLeft;
        return this;
    }
    public Long getDownloadTimesLeft() {
        return this.downloadTimesLeft;
    }

    public QueryDciRegistrationResponse setInvoiceUrlList(java.util.List<String> invoiceUrlList) {
        this.invoiceUrlList = invoiceUrlList;
        return this;
    }
    public java.util.List<String> getInvoiceUrlList() {
        return this.invoiceUrlList;
    }

    public QueryDciRegistrationResponse setFailDetail(String failDetail) {
        this.failDetail = failDetail;
        return this;
    }
    public String getFailDetail() {
        return this.failDetail;
    }

    public QueryDciRegistrationResponse setAmendType(String amendType) {
        this.amendType = amendType;
        return this;
    }
    public String getAmendType() {
        return this.amendType;
    }

    public QueryDciRegistrationResponse setApplyFormUrl(String applyFormUrl) {
        this.applyFormUrl = applyFormUrl;
        return this;
    }
    public String getApplyFormUrl() {
        return this.applyFormUrl;
    }

    public QueryDciRegistrationResponse setFlowNumber(String flowNumber) {
        this.flowNumber = flowNumber;
        return this;
    }
    public String getFlowNumber() {
        return this.flowNumber;
    }

}
