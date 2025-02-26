// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class QueryBlockchainBccrDciRegistrationResponse extends TeaModel {
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

    public static QueryBlockchainBccrDciRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBccrDciRegistrationResponse self = new QueryBlockchainBccrDciRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBccrDciRegistrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBccrDciRegistrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBccrDciRegistrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBccrDciRegistrationResponse setContentStatus(String contentStatus) {
        this.contentStatus = contentStatus;
        return this;
    }
    public String getContentStatus() {
        return this.contentStatus;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegisterCertTxHash(String registerCertTxHash) {
        this.registerCertTxHash = registerCertTxHash;
        return this;
    }
    public String getRegisterCertTxHash() {
        return this.registerCertTxHash;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegisterCertBlockHeight(String registerCertBlockHeight) {
        this.registerCertBlockHeight = registerCertBlockHeight;
        return this;
    }
    public String getRegisterCertBlockHeight() {
        return this.registerCertBlockHeight;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegisterCertTsr(String registerCertTsr) {
        this.registerCertTsr = registerCertTsr;
        return this;
    }
    public String getRegisterCertTsr() {
        return this.registerCertTsr;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegisterCertPngFileId(String registerCertPngFileId) {
        this.registerCertPngFileId = registerCertPngFileId;
        return this;
    }
    public String getRegisterCertPngFileId() {
        return this.registerCertPngFileId;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegisterSampleFileId(String registerSampleFileId) {
        this.registerSampleFileId = registerSampleFileId;
        return this;
    }
    public String getRegisterSampleFileId() {
        return this.registerSampleFileId;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegisterSamplePngFileId(String registerSamplePngFileId) {
        this.registerSamplePngFileId = registerSamplePngFileId;
        return this;
    }
    public String getRegisterSamplePngFileId() {
        return this.registerSamplePngFileId;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegisterDownloadTimesLeft(Long registerDownloadTimesLeft) {
        this.registerDownloadTimesLeft = registerDownloadTimesLeft;
        return this;
    }
    public Long getRegisterDownloadTimesLeft() {
        return this.registerDownloadTimesLeft;
    }

    public QueryBlockchainBccrDciRegistrationResponse setErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }
    public String getErrorReason() {
        return this.errorReason;
    }

    public QueryBlockchainBccrDciRegistrationResponse setErrorReasonCn(String errorReasonCn) {
        this.errorReasonCn = errorReasonCn;
        return this;
    }
    public String getErrorReasonCn() {
        return this.errorReasonCn;
    }

    public QueryBlockchainBccrDciRegistrationResponse setInvoiceFileIdList(java.util.List<String> invoiceFileIdList) {
        this.invoiceFileIdList = invoiceFileIdList;
        return this;
    }
    public java.util.List<String> getInvoiceFileIdList() {
        return this.invoiceFileIdList;
    }

    public QueryBlockchainBccrDciRegistrationResponse setApplyRegisterTime(String applyRegisterTime) {
        this.applyRegisterTime = applyRegisterTime;
        return this;
    }
    public String getApplyRegisterTime() {
        return this.applyRegisterTime;
    }

    public QueryBlockchainBccrDciRegistrationResponse setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDigitalRegisterStatus(String digitalRegisterStatus) {
        this.digitalRegisterStatus = digitalRegisterStatus;
        return this;
    }
    public String getDigitalRegisterStatus() {
        return this.digitalRegisterStatus;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDigitalRegisterApplyTime(String digitalRegisterApplyTime) {
        this.digitalRegisterApplyTime = digitalRegisterApplyTime;
        return this;
    }
    public String getDigitalRegisterApplyTime() {
        return this.digitalRegisterApplyTime;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDigitalRegisterCompletionTime(String digitalRegisterCompletionTime) {
        this.digitalRegisterCompletionTime = digitalRegisterCompletionTime;
        return this;
    }
    public String getDigitalRegisterCompletionTime() {
        return this.digitalRegisterCompletionTime;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDigitalRegisterCertPngUrl(String digitalRegisterCertPngUrl) {
        this.digitalRegisterCertPngUrl = digitalRegisterCertPngUrl;
        return this;
    }
    public String getDigitalRegisterCertPngUrl() {
        return this.digitalRegisterCertPngUrl;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDigitalRegisterSamplePngUrl(String digitalRegisterSamplePngUrl) {
        this.digitalRegisterSamplePngUrl = digitalRegisterSamplePngUrl;
        return this;
    }
    public String getDigitalRegisterSamplePngUrl() {
        return this.digitalRegisterSamplePngUrl;
    }

    public QueryBlockchainBccrDciRegistrationResponse setDownloadTimesLeft(Long downloadTimesLeft) {
        this.downloadTimesLeft = downloadTimesLeft;
        return this;
    }
    public Long getDownloadTimesLeft() {
        return this.downloadTimesLeft;
    }

    public QueryBlockchainBccrDciRegistrationResponse setInvoiceUrlList(java.util.List<String> invoiceUrlList) {
        this.invoiceUrlList = invoiceUrlList;
        return this;
    }
    public java.util.List<String> getInvoiceUrlList() {
        return this.invoiceUrlList;
    }

    public QueryBlockchainBccrDciRegistrationResponse setFailDetail(String failDetail) {
        this.failDetail = failDetail;
        return this;
    }
    public String getFailDetail() {
        return this.failDetail;
    }

    public QueryBlockchainBccrDciRegistrationResponse setAmendType(String amendType) {
        this.amendType = amendType;
        return this;
    }
    public String getAmendType() {
        return this.amendType;
    }

    public QueryBlockchainBccrDciRegistrationResponse setApplyFormUrl(String applyFormUrl) {
        this.applyFormUrl = applyFormUrl;
        return this;
    }
    public String getApplyFormUrl() {
        return this.applyFormUrl;
    }

    public QueryBlockchainBccrDciRegistrationResponse setFlowNumber(String flowNumber) {
        this.flowNumber = flowNumber;
        return this;
    }
    public String getFlowNumber() {
        return this.flowNumber;
    }

}
