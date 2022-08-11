// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class StartBaasDidVcrepositoryIssueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
    @NameInMap("verifiable_claim_content")
    public String verifiableClaimContent;

    // 颁发的证书唯一id，颁发成功后返回。
    @NameInMap("verifiable_claim_id")
    public String verifiableClaimId;

    public static StartBaasDidVcrepositoryIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBaasDidVcrepositoryIssueResponse self = new StartBaasDidVcrepositoryIssueResponse();
        return TeaModel.build(map, self);
    }

    public StartBaasDidVcrepositoryIssueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartBaasDidVcrepositoryIssueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartBaasDidVcrepositoryIssueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartBaasDidVcrepositoryIssueResponse setVerifiableClaimContent(String verifiableClaimContent) {
        this.verifiableClaimContent = verifiableClaimContent;
        return this;
    }
    public String getVerifiableClaimContent() {
        return this.verifiableClaimContent;
    }

    public StartBaasDidVcrepositoryIssueResponse setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

}
