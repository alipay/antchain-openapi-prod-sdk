// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerAuthorizationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // true代表需要进行授权询问
    // false代表不需要进行授权询问
    @NameInMap("is_need_ask_auth")
    public Boolean isNeedAskAuth;

    public static QueryInnerAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAuthorizationResponse self = new QueryInnerAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerAuthorizationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerAuthorizationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerAuthorizationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerAuthorizationResponse setIsNeedAskAuth(Boolean isNeedAskAuth) {
        this.isNeedAskAuth = isNeedAskAuth;
        return this;
    }
    public Boolean getIsNeedAskAuth() {
        return this.isNeedAskAuth;
    }

}
