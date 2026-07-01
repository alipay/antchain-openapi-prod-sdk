// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.txmzspu.models;

import com.aliyun.tea.*;

public class EncryptBlockchainBotIdsquaredAuthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // serverAuthCode
    @NameInMap("server_auth_code")
    public String serverAuthCode;

    // encryptData
    @NameInMap("encrypt_data")
    public String encryptData;

    public static EncryptBlockchainBotIdsquaredAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptBlockchainBotIdsquaredAuthResponse self = new EncryptBlockchainBotIdsquaredAuthResponse();
        return TeaModel.build(map, self);
    }

    public EncryptBlockchainBotIdsquaredAuthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EncryptBlockchainBotIdsquaredAuthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EncryptBlockchainBotIdsquaredAuthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EncryptBlockchainBotIdsquaredAuthResponse setServerAuthCode(String serverAuthCode) {
        this.serverAuthCode = serverAuthCode;
        return this;
    }
    public String getServerAuthCode() {
        return this.serverAuthCode;
    }

    public EncryptBlockchainBotIdsquaredAuthResponse setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

}
