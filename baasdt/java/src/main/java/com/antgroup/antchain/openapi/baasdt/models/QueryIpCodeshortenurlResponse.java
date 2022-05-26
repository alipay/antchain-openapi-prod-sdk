// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCodeshortenurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 小程序短链
    @NameInMap("shorten_url")
    public String shortenUrl;

    public static QueryIpCodeshortenurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCodeshortenurlResponse self = new QueryIpCodeshortenurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpCodeshortenurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpCodeshortenurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpCodeshortenurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpCodeshortenurlResponse setShortenUrl(String shortenUrl) {
        this.shortenUrl = shortenUrl;
        return this;
    }
    public String getShortenUrl() {
        return this.shortenUrl;
    }

}
