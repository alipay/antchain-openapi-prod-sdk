// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class QueryDepositCertificateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务幂等id
    @NameInMap("order_id")
    public String orderId;

    // 服务实例id
    @NameInMap("service_id")
    public String serviceId;

    // 基础信息json
    @NameInMap("base_info_json")
    public String baseInfoJson;

    // 额外信息json
    @NameInMap("extension_info_json")
    public String extensionInfoJson;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 块高
    @NameInMap("block_number")
    public Long blockNumber;

    // 交易时间戳
    @NameInMap("timestamp")
    public Long timestamp;

    // 文件地址
    @NameInMap("file_url")
    public String fileUrl;

    // 文件id
    @NameInMap("file_id")
    public String fileId;

    // 文件哈希
    @NameInMap("file_hash")
    public String fileHash;

    public static QueryDepositCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDepositCertificateResponse self = new QueryDepositCertificateResponse();
        return TeaModel.build(map, self);
    }

    public QueryDepositCertificateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDepositCertificateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDepositCertificateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDepositCertificateResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDepositCertificateResponse setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryDepositCertificateResponse setBaseInfoJson(String baseInfoJson) {
        this.baseInfoJson = baseInfoJson;
        return this;
    }
    public String getBaseInfoJson() {
        return this.baseInfoJson;
    }

    public QueryDepositCertificateResponse setExtensionInfoJson(String extensionInfoJson) {
        this.extensionInfoJson = extensionInfoJson;
        return this;
    }
    public String getExtensionInfoJson() {
        return this.extensionInfoJson;
    }

    public QueryDepositCertificateResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryDepositCertificateResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryDepositCertificateResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public QueryDepositCertificateResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public QueryDepositCertificateResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public QueryDepositCertificateResponse setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

}
