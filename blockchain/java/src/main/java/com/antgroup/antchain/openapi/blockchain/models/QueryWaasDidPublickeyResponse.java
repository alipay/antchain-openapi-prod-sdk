// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryWaasDidPublickeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 公钥信息
    @NameInMap("public_key_info")
    public PublicKeyInfo publicKeyInfo;

    public static QueryWaasDidPublickeyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWaasDidPublickeyResponse self = new QueryWaasDidPublickeyResponse();
        return TeaModel.build(map, self);
    }

    public QueryWaasDidPublickeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWaasDidPublickeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWaasDidPublickeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWaasDidPublickeyResponse setPublicKeyInfo(PublicKeyInfo publicKeyInfo) {
        this.publicKeyInfo = publicKeyInfo;
        return this;
    }
    public PublicKeyInfo getPublicKeyInfo() {
        return this.publicKeyInfo;
    }

}
