// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class QueryArkassetvisualResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应参数
    @NameInMap("response_body")
    public String responseBody;

    public static QueryArkassetvisualResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryArkassetvisualResponse self = new QueryArkassetvisualResponse();
        return TeaModel.build(map, self);
    }

    public QueryArkassetvisualResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryArkassetvisualResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryArkassetvisualResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryArkassetvisualResponse setResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }
    public String getResponseBody() {
        return this.responseBody;
    }

}
