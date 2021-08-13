// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCopyrightResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证状态，PROCESSING：存证中；SUCCESS：存证成功；FAIL：存证失败
    @NameInMap("status")
    public String status;

    // 文件hash
    @NameInMap("hash")
    public String hash;

    // 存证交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 存证块高
    @NameInMap("block_height")
    public Long blockHeight;

    // 存证时间
    @NameInMap("timestamp")
    public Long timestamp;

    // 证书oss地址
    @NameInMap("certificate_oss")
    public String certificateOss;

    // 证书下载链接
    @NameInMap("certificate_downurl")
    public String certificateDownurl;

    // 公证处证书编号
    @NameInMap("certificate_no")
    public String certificateNo;

    public static QueryIpCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCopyrightResponse self = new QueryIpCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpCopyrightResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpCopyrightResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpCopyrightResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpCopyrightResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryIpCopyrightResponse setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public QueryIpCopyrightResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryIpCopyrightResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public QueryIpCopyrightResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public QueryIpCopyrightResponse setCertificateOss(String certificateOss) {
        this.certificateOss = certificateOss;
        return this;
    }
    public String getCertificateOss() {
        return this.certificateOss;
    }

    public QueryIpCopyrightResponse setCertificateDownurl(String certificateDownurl) {
        this.certificateDownurl = certificateDownurl;
        return this;
    }
    public String getCertificateDownurl() {
        return this.certificateDownurl;
    }

    public QueryIpCopyrightResponse setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

}
