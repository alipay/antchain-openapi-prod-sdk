// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SignAntchainDasKyaManageddidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实际使用的密钥 ID，格式为 <did>#keys-1
    @NameInMap("key_id")
    public String keyId;

    // 算法类型
    @NameInMap("algorithm")
    public String algorithm;

    // Multibase 编码的 Ed25519 签名
    @NameInMap("signature_multibase")
    public String signatureMultibase;

    public static SignAntchainDasKyaManageddidResponse build(java.util.Map<String, ?> map) throws Exception {
        SignAntchainDasKyaManageddidResponse self = new SignAntchainDasKyaManageddidResponse();
        return TeaModel.build(map, self);
    }

    public SignAntchainDasKyaManageddidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SignAntchainDasKyaManageddidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SignAntchainDasKyaManageddidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SignAntchainDasKyaManageddidResponse setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public SignAntchainDasKyaManageddidResponse setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public SignAntchainDasKyaManageddidResponse setSignatureMultibase(String signatureMultibase) {
        this.signatureMultibase = signatureMultibase;
        return this;
    }
    public String getSignatureMultibase() {
        return this.signatureMultibase;
    }

}
