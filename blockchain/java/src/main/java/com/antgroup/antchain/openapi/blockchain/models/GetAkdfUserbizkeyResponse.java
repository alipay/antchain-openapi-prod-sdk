// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAkdfUserbizkeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链id
    @NameInMap("bizid")
    public String bizid;

    // 4dY3DnjHPogYcsiVujkdhBRBceY8ZT5cUBP1zRBAZia7WZhJZyHmWbARBAWvy13aB7cNenbBg5D4CnM1gijv5YiSgBgHTC89sag9M7cxxdaRMrvFEA4YpcaunZdd4Q1APBynsDsqmVyzyGnZk5Kez9WBz5PZRyRC3gqCNXhHLLwuJmGCn8aEv3Ar9vsFUQa6qAgNtVVgiDxEYqBNNQc9K51ytdpBX81ph8nzy2ctUvLqi4G7iFU1wVsdd14XS7oz1v54M5Hb2CUTkv7ncXZSnNJYDsGyKAmHiriL2rargNzp6v2nUXhGSrkCVMDCVkZVcpeVFqSxKGatVdkGYUAswt3vtRVCcs
    @NameInMap("encrypted_private_key")
    public String encryptedPrivateKey;

    public static GetAkdfUserbizkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAkdfUserbizkeyResponse self = new GetAkdfUserbizkeyResponse();
        return TeaModel.build(map, self);
    }

    public GetAkdfUserbizkeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAkdfUserbizkeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAkdfUserbizkeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAkdfUserbizkeyResponse setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public GetAkdfUserbizkeyResponse setEncryptedPrivateKey(String encryptedPrivateKey) {
        this.encryptedPrivateKey = encryptedPrivateKey;
        return this;
    }
    public String getEncryptedPrivateKey() {
        return this.encryptedPrivateKey;
    }

}
