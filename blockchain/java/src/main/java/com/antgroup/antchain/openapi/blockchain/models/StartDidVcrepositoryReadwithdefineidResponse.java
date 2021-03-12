// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryReadwithdefineidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
    @NameInMap("verifiable_claim_content")
    public String verifiableClaimContent;

    public static StartDidVcrepositoryReadwithdefineidResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryReadwithdefineidResponse self = new StartDidVcrepositoryReadwithdefineidResponse();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryReadwithdefineidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDidVcrepositoryReadwithdefineidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDidVcrepositoryReadwithdefineidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDidVcrepositoryReadwithdefineidResponse setVerifiableClaimContent(String verifiableClaimContent) {
        this.verifiableClaimContent = verifiableClaimContent;
        return this;
    }
    public String getVerifiableClaimContent() {
        return this.verifiableClaimContent;
    }

}
