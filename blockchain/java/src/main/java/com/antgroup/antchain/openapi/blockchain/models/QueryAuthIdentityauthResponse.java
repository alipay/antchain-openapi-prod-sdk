// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthIdentityauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核身结果
    @NameInMap("verify_result")
    public Boolean verifyResult;

    public static QueryAuthIdentityauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthIdentityauthResponse self = new QueryAuthIdentityauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthIdentityauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthIdentityauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthIdentityauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthIdentityauthResponse setVerifyResult(Boolean verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public Boolean getVerifyResult() {
        return this.verifyResult;
    }

}
