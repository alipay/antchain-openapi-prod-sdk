// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EncryptIdsquaredAuthResponse extends TeaModel {
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

    public static EncryptIdsquaredAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptIdsquaredAuthResponse self = new EncryptIdsquaredAuthResponse();
        return TeaModel.build(map, self);
    }

    public EncryptIdsquaredAuthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EncryptIdsquaredAuthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EncryptIdsquaredAuthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EncryptIdsquaredAuthResponse setServerAuthCode(String serverAuthCode) {
        this.serverAuthCode = serverAuthCode;
        return this;
    }
    public String getServerAuthCode() {
        return this.serverAuthCode;
    }

    public EncryptIdsquaredAuthResponse setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

}
