// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryShorturlParseabilityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解析结果列表
    @NameInMap("data")
    public java.util.List<ParseResultData> data;

    public static QueryShorturlParseabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShorturlParseabilityResponse self = new QueryShorturlParseabilityResponse();
        return TeaModel.build(map, self);
    }

    public QueryShorturlParseabilityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryShorturlParseabilityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryShorturlParseabilityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryShorturlParseabilityResponse setData(java.util.List<ParseResultData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ParseResultData> getData() {
        return this.data;
    }

}
