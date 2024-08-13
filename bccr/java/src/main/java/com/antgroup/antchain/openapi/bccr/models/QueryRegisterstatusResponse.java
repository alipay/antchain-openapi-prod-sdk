// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryRegisterstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 登记状态
    @NameInMap("status")
    public String status;

    // 存证时间
    @NameInMap("timestamp")
    public Long timestamp;

    // 文件hash
    @NameInMap("hash")
    public String hash;

    // 统一证据编号（存证交易HASH）
    @NameInMap("tx_hash")
    public String txHash;

    // 存证块高
    @NameInMap("block_height")
    public Long blockHeight;

    // tsr信息
    @NameInMap("tsr")
    public String tsr;

    // 公证处证书下载链接
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 公证处证书编号
    @NameInMap("certificate_storage_no")
    public String certificateStorageNo;

    // 授时中心证书下载链接
    @NameInMap("certificate_time_url")
    public String certificateTimeUrl;

    // 证据包下载地址（状态为SUCCESS并且请求要求生成证据包才有数据）
    @NameInMap("package_url")
    public String packageUrl;

    // 证据包存证交易HASH  注意只有生成了证据包才会返回
    @NameInMap("package_tx_hash")
    public String packageTxHash;

    // 权利声明书下载地址 注意只有传递了权利信息并且生成了权利声明书才会返回
    @NameInMap("statement_url")
    public String statementUrl;

    // 安全信息
    @NameInMap("security")
    public SecurityData security;

    // 保管函url
    @NameInMap("correction_url")
    public String correctionUrl;

    public static QueryRegisterstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRegisterstatusResponse self = new QueryRegisterstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryRegisterstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRegisterstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRegisterstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRegisterstatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRegisterstatusResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public QueryRegisterstatusResponse setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public QueryRegisterstatusResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryRegisterstatusResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public QueryRegisterstatusResponse setTsr(String tsr) {
        this.tsr = tsr;
        return this;
    }
    public String getTsr() {
        return this.tsr;
    }

    public QueryRegisterstatusResponse setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public QueryRegisterstatusResponse setCertificateStorageNo(String certificateStorageNo) {
        this.certificateStorageNo = certificateStorageNo;
        return this;
    }
    public String getCertificateStorageNo() {
        return this.certificateStorageNo;
    }

    public QueryRegisterstatusResponse setCertificateTimeUrl(String certificateTimeUrl) {
        this.certificateTimeUrl = certificateTimeUrl;
        return this;
    }
    public String getCertificateTimeUrl() {
        return this.certificateTimeUrl;
    }

    public QueryRegisterstatusResponse setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public QueryRegisterstatusResponse setPackageTxHash(String packageTxHash) {
        this.packageTxHash = packageTxHash;
        return this;
    }
    public String getPackageTxHash() {
        return this.packageTxHash;
    }

    public QueryRegisterstatusResponse setStatementUrl(String statementUrl) {
        this.statementUrl = statementUrl;
        return this;
    }
    public String getStatementUrl() {
        return this.statementUrl;
    }

    public QueryRegisterstatusResponse setSecurity(SecurityData security) {
        this.security = security;
        return this;
    }
    public SecurityData getSecurity() {
        return this.security;
    }

    public QueryRegisterstatusResponse setCorrectionUrl(String correctionUrl) {
        this.correctionUrl = correctionUrl;
        return this;
    }
    public String getCorrectionUrl() {
        return this.correctionUrl;
    }

}
