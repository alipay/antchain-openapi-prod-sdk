// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartVcVcrepositoryReadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 密文加密16进制表示的字符串，是请求方did对应的didDoc中的公钥加密AES密钥的结果，使用标准信封加密的方式，AES密钥用于解密verifiable_claim_content的claim字段，如果此auth_access_key是空字符串，则说明verifiable_claim_content的内容是明文。
    @NameInMap("auth_access_key")
    public String authAccessKey;

    // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义，可能为密文},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
    @NameInMap("verifiable_claim_content")
    public String verifiableClaimContent;

    public static StartVcVcrepositoryReadResponse build(java.util.Map<String, ?> map) throws Exception {
        StartVcVcrepositoryReadResponse self = new StartVcVcrepositoryReadResponse();
        return TeaModel.build(map, self);
    }

    public StartVcVcrepositoryReadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartVcVcrepositoryReadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartVcVcrepositoryReadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartVcVcrepositoryReadResponse setAuthAccessKey(String authAccessKey) {
        this.authAccessKey = authAccessKey;
        return this;
    }
    public String getAuthAccessKey() {
        return this.authAccessKey;
    }

    public StartVcVcrepositoryReadResponse setVerifiableClaimContent(String verifiableClaimContent) {
        this.verifiableClaimContent = verifiableClaimContent;
        return this;
    }
    public String getVerifiableClaimContent() {
        return this.verifiableClaimContent;
    }

}
