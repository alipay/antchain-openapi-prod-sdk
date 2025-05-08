// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryAccountShorturlparseresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解析记录列表
    @NameInMap("data")
    public java.util.List<ShortUrlParseResult> data;

    public static QueryAccountShorturlparseresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountShorturlparseresultResponse self = new QueryAccountShorturlparseresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountShorturlparseresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAccountShorturlparseresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAccountShorturlparseresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAccountShorturlparseresultResponse setData(java.util.List<ShortUrlParseResult> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ShortUrlParseResult> getData() {
        return this.data;
    }

}
