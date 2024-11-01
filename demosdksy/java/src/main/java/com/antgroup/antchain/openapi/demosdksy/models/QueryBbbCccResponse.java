// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdksy.models;

import com.aliyun.tea.*;

public class QueryBbbCccResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1321
    @NameInMap("test")
    public String test;

    public static QueryBbbCccResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBbbCccResponse self = new QueryBbbCccResponse();
        return TeaModel.build(map, self);
    }

    public QueryBbbCccResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBbbCccResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBbbCccResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBbbCccResponse setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
