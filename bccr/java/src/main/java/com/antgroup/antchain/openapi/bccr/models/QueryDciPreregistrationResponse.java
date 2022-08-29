// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciPreregistrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预登记状态
    @NameInMap("status")
    public String status;

    // 文件哈希
    @NameInMap("file_hash")
    public String fileHash;

    // 文件哈希存证txHash
    @NameInMap("file_hash_tx_hash")
    public String fileHashTxHash;

    // 文件哈希存证区块高度
    @NameInMap("file_hash_block_height")
    public String fileHashBlockHeight;

    // dci编码
    @NameInMap("dci_code")
    public String dciCode;

    // DCI码存证txHash
    @NameInMap("dci_code_tx_hash")
    public String dciCodeTxHash;

    // DCI码存证高度
    @NameInMap("dci_code_block_height")
    public String dciCodeBlockHeight;

    // DCI码fileHash存证txHash
    @NameInMap("dci_code_file_tx_hash")
    public String dciCodeFileTxHash;

    // DCI码fileHash存证高度
    @NameInMap("dci_code_file_block_height")
    public String dciCodeFileBlockHeight;

    // 预登记证书txhash
    @NameInMap("pre_reg_cert_tx_hash")
    public String preRegCertTxHash;

    // 预登记证书存证高度
    @NameInMap("pre_reg_cert_block_height")
    public String preRegCertBlockHeight;

    // 预登记取消txHash
    @NameInMap("cancel_tx_hash")
    public String cancelTxHash;

    // 预登记取消存证高度
    @NameInMap("cancel_block_height")
    public String cancelBlockHeight;

    // dciCode的可信时间戳信息
    @NameInMap("dci_code_tsr")
    public String dciCodeTsr;

    // dciCode fileHash的可信时间戳信息
    @NameInMap("dci_code_file_tsr")
    public String dciCodeFileTsr;

    // 预登记证书可信时间戳信息
    @NameInMap("pre_reg_cert_tsr")
    public String preRegCertTsr;

    // 预登记证书oss fileId
    @NameInMap("pre_reg_cert_file_id")
    public String preRegCertFileId;

    // 预登记证书fileHash
    @NameInMap("pre_reg_cert_file_hash")
    public String preRegCertFileHash;

    // 预登记证书下载链接
    @NameInMap("pre_reg_cert_url")
    public String preRegCertUrl;

    // 预览图oss fileId
    @NameInMap("png_file_id")
    public String pngFileId;

    // 申请发码时间
    @NameInMap("apply_obtain_date")
    public String applyObtainDate;

    // DCI码创建时间
    @NameInMap("dci_code_obtain_date")
    public String dciCodeObtainDate;

    // 错误原因
    @NameInMap("error_reason")
    public String errorReason;

    // 公式地址
    @NameInMap("publication_url")
    public String publicationUrl;

    public static QueryDciPreregistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDciPreregistrationResponse self = new QueryDciPreregistrationResponse();
        return TeaModel.build(map, self);
    }

    public QueryDciPreregistrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDciPreregistrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDciPreregistrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDciPreregistrationResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDciPreregistrationResponse setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public QueryDciPreregistrationResponse setFileHashTxHash(String fileHashTxHash) {
        this.fileHashTxHash = fileHashTxHash;
        return this;
    }
    public String getFileHashTxHash() {
        return this.fileHashTxHash;
    }

    public QueryDciPreregistrationResponse setFileHashBlockHeight(String fileHashBlockHeight) {
        this.fileHashBlockHeight = fileHashBlockHeight;
        return this;
    }
    public String getFileHashBlockHeight() {
        return this.fileHashBlockHeight;
    }

    public QueryDciPreregistrationResponse setDciCode(String dciCode) {
        this.dciCode = dciCode;
        return this;
    }
    public String getDciCode() {
        return this.dciCode;
    }

    public QueryDciPreregistrationResponse setDciCodeTxHash(String dciCodeTxHash) {
        this.dciCodeTxHash = dciCodeTxHash;
        return this;
    }
    public String getDciCodeTxHash() {
        return this.dciCodeTxHash;
    }

    public QueryDciPreregistrationResponse setDciCodeBlockHeight(String dciCodeBlockHeight) {
        this.dciCodeBlockHeight = dciCodeBlockHeight;
        return this;
    }
    public String getDciCodeBlockHeight() {
        return this.dciCodeBlockHeight;
    }

    public QueryDciPreregistrationResponse setDciCodeFileTxHash(String dciCodeFileTxHash) {
        this.dciCodeFileTxHash = dciCodeFileTxHash;
        return this;
    }
    public String getDciCodeFileTxHash() {
        return this.dciCodeFileTxHash;
    }

    public QueryDciPreregistrationResponse setDciCodeFileBlockHeight(String dciCodeFileBlockHeight) {
        this.dciCodeFileBlockHeight = dciCodeFileBlockHeight;
        return this;
    }
    public String getDciCodeFileBlockHeight() {
        return this.dciCodeFileBlockHeight;
    }

    public QueryDciPreregistrationResponse setPreRegCertTxHash(String preRegCertTxHash) {
        this.preRegCertTxHash = preRegCertTxHash;
        return this;
    }
    public String getPreRegCertTxHash() {
        return this.preRegCertTxHash;
    }

    public QueryDciPreregistrationResponse setPreRegCertBlockHeight(String preRegCertBlockHeight) {
        this.preRegCertBlockHeight = preRegCertBlockHeight;
        return this;
    }
    public String getPreRegCertBlockHeight() {
        return this.preRegCertBlockHeight;
    }

    public QueryDciPreregistrationResponse setCancelTxHash(String cancelTxHash) {
        this.cancelTxHash = cancelTxHash;
        return this;
    }
    public String getCancelTxHash() {
        return this.cancelTxHash;
    }

    public QueryDciPreregistrationResponse setCancelBlockHeight(String cancelBlockHeight) {
        this.cancelBlockHeight = cancelBlockHeight;
        return this;
    }
    public String getCancelBlockHeight() {
        return this.cancelBlockHeight;
    }

    public QueryDciPreregistrationResponse setDciCodeTsr(String dciCodeTsr) {
        this.dciCodeTsr = dciCodeTsr;
        return this;
    }
    public String getDciCodeTsr() {
        return this.dciCodeTsr;
    }

    public QueryDciPreregistrationResponse setDciCodeFileTsr(String dciCodeFileTsr) {
        this.dciCodeFileTsr = dciCodeFileTsr;
        return this;
    }
    public String getDciCodeFileTsr() {
        return this.dciCodeFileTsr;
    }

    public QueryDciPreregistrationResponse setPreRegCertTsr(String preRegCertTsr) {
        this.preRegCertTsr = preRegCertTsr;
        return this;
    }
    public String getPreRegCertTsr() {
        return this.preRegCertTsr;
    }

    public QueryDciPreregistrationResponse setPreRegCertFileId(String preRegCertFileId) {
        this.preRegCertFileId = preRegCertFileId;
        return this;
    }
    public String getPreRegCertFileId() {
        return this.preRegCertFileId;
    }

    public QueryDciPreregistrationResponse setPreRegCertFileHash(String preRegCertFileHash) {
        this.preRegCertFileHash = preRegCertFileHash;
        return this;
    }
    public String getPreRegCertFileHash() {
        return this.preRegCertFileHash;
    }

    public QueryDciPreregistrationResponse setPreRegCertUrl(String preRegCertUrl) {
        this.preRegCertUrl = preRegCertUrl;
        return this;
    }
    public String getPreRegCertUrl() {
        return this.preRegCertUrl;
    }

    public QueryDciPreregistrationResponse setPngFileId(String pngFileId) {
        this.pngFileId = pngFileId;
        return this;
    }
    public String getPngFileId() {
        return this.pngFileId;
    }

    public QueryDciPreregistrationResponse setApplyObtainDate(String applyObtainDate) {
        this.applyObtainDate = applyObtainDate;
        return this;
    }
    public String getApplyObtainDate() {
        return this.applyObtainDate;
    }

    public QueryDciPreregistrationResponse setDciCodeObtainDate(String dciCodeObtainDate) {
        this.dciCodeObtainDate = dciCodeObtainDate;
        return this;
    }
    public String getDciCodeObtainDate() {
        return this.dciCodeObtainDate;
    }

    public QueryDciPreregistrationResponse setErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }
    public String getErrorReason() {
        return this.errorReason;
    }

    public QueryDciPreregistrationResponse setPublicationUrl(String publicationUrl) {
        this.publicationUrl = publicationUrl;
        return this;
    }
    public String getPublicationUrl() {
        return this.publicationUrl;
    }

}
