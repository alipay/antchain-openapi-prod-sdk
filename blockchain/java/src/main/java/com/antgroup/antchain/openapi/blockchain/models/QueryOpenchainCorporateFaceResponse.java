// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryOpenchainCorporateFaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 访问授权宝的url
    @NameInMap("authed_url")
    public String authedUrl;

    public static QueryOpenchainCorporateFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpenchainCorporateFaceResponse self = new QueryOpenchainCorporateFaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpenchainCorporateFaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpenchainCorporateFaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpenchainCorporateFaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpenchainCorporateFaceResponse setAuthedUrl(String authedUrl) {
        this.authedUrl = authedUrl;
        return this;
    }
    public String getAuthedUrl() {
        return this.authedUrl;
    }

}
