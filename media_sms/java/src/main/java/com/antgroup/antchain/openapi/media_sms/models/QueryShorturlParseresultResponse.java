// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryShorturlParseresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 短链解析记录
    @NameInMap("data")
    public java.util.List<ShortUrlParseResult> data;

    public static QueryShorturlParseresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShorturlParseresultResponse self = new QueryShorturlParseresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryShorturlParseresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryShorturlParseresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryShorturlParseresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryShorturlParseresultResponse setData(java.util.List<ShortUrlParseResult> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ShortUrlParseResult> getData() {
        return this.data;
    }

}
