// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_10abee70bc4f4d4d90334ebfb4895c12.models;

import com.aliyun.tea.*;

public class QueryDemoTestTestobjectBbbResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 测试返回参数
    @NameInMap("response")
    public String response;

    public static QueryDemoTestTestobjectBbbResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestTestobjectBbbResponse self = new QueryDemoTestTestobjectBbbResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestTestobjectBbbResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoTestTestobjectBbbResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoTestTestobjectBbbResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoTestTestobjectBbbResponse setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

}
