// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitPrivatecontractIntanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 私有化服务实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 签名私钥的base64格式字符串
    @NameInMap("private_key")
    public String privateKey;

    // 验签公钥的base64格式字符串
    @NameInMap("public_key")
    public String publicKey;

    // 回调使用的签名私钥
    @NameInMap("private_key_callback")
    public String privateKeyCallback;

    // 回调使用的验签公钥
    @NameInMap("public_key_callback")
    public String publicKeyCallback;

    public static InitPrivatecontractIntanceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitPrivatecontractIntanceResponse self = new InitPrivatecontractIntanceResponse();
        return TeaModel.build(map, self);
    }

    public InitPrivatecontractIntanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitPrivatecontractIntanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitPrivatecontractIntanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitPrivatecontractIntanceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InitPrivatecontractIntanceResponse setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public InitPrivatecontractIntanceResponse setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public InitPrivatecontractIntanceResponse setPrivateKeyCallback(String privateKeyCallback) {
        this.privateKeyCallback = privateKeyCallback;
        return this;
    }
    public String getPrivateKeyCallback() {
        return this.privateKeyCallback;
    }

    public InitPrivatecontractIntanceResponse setPublicKeyCallback(String publicKeyCallback) {
        this.publicKeyCallback = publicKeyCallback;
        return this;
    }
    public String getPublicKeyCallback() {
        return this.publicKeyCallback;
    }

}
