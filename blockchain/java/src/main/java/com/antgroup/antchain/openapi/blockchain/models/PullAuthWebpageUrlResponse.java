// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PullAuthWebpageUrlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 可用的H5的Url，并且已经携带授权宝侧相关的参数：token、bizId等.
    @NameInMap("auth_url")
    public String authUrl;

    // 此请求业务方的C端用户的DID，在授权宝侧相当于C端用户给业务方做授权，因此C端用户是issuer，业务方的B类客户是目标subject。
    @NameInMap("issuer_did")
    public String issuerDid;

    // 此请求业务方B类客户的DID
    @NameInMap("subject_did")
    public String subjectDid;

    public static PullAuthWebpageUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        PullAuthWebpageUrlResponse self = new PullAuthWebpageUrlResponse();
        return TeaModel.build(map, self);
    }

    public PullAuthWebpageUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullAuthWebpageUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullAuthWebpageUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullAuthWebpageUrlResponse setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

    public PullAuthWebpageUrlResponse setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public PullAuthWebpageUrlResponse setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

}
