// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class QueryDepositResponse extends TeaModel {
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

    public static QueryDepositResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDepositResponse self = new QueryDepositResponse();
        return TeaModel.build(map, self);
    }

    public QueryDepositResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDepositResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDepositResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDepositResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDepositResponse setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryDepositResponse setBaseInfoJson(String baseInfoJson) {
        this.baseInfoJson = baseInfoJson;
        return this;
    }
    public String getBaseInfoJson() {
        return this.baseInfoJson;
    }

    public QueryDepositResponse setExtensionInfoJson(String extensionInfoJson) {
        this.extensionInfoJson = extensionInfoJson;
        return this;
    }
    public String getExtensionInfoJson() {
        return this.extensionInfoJson;
    }

    public QueryDepositResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryDepositResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryDepositResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public QueryDepositResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public QueryDepositResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public QueryDepositResponse setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

}
