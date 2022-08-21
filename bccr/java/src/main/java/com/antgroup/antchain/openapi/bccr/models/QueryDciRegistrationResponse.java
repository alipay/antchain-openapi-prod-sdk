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

    // 状态
    @NameInMap("content_status")
    public String contentStatus;

    // 登记证书txHash
    @NameInMap("register_cert_tx_hash")
    public String registerCertTxHash;

    // 登记证书存证高度
    @NameInMap("register_cert_block_height")
    public String registerCertBlockHeight;

    // 登记证书tsr
    @NameInMap("register_cert_tsr")
    public String registerCertTsr;

    // 登记证书预览fileId
    @NameInMap("register_cert_png_file_id")
    public String registerCertPngFileId;

    // 数登样本oss fileId
    @NameInMap("register_sample_file_id")
    public String registerSampleFileId;

    // 数登样本预览oss fileId
    @NameInMap("register_sample_png_file_id")
    public String registerSamplePngFileId;

    // 剩余下载次数
    @NameInMap("register_download_times_left")
    public Long registerDownloadTimesLeft;

    // 错误原因
    @NameInMap("error_reason")
    public String errorReason;

    // 发票oss fileId List
    @NameInMap("invoice_file_id_list")
    public java.util.List<String> invoiceFileIdList;

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

    public QueryDciRegistrationResponse setInvoiceFileIdList(java.util.List<String> invoiceFileIdList) {
        this.invoiceFileIdList = invoiceFileIdList;
        return this;
    }
    public java.util.List<String> getInvoiceFileIdList() {
        return this.invoiceFileIdList;
    }

}
