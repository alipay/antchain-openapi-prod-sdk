// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class QueryAntchainDemosdkAaaCciResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 测试
    @NameInMap("test")
    public String test;

    // 1
    @NameInMap("num")
    public String num;

    public static QueryAntchainDemosdkAaaCciResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDemosdkAaaCciResponse self = new QueryAntchainDemosdkAaaCciResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDemosdkAaaCciResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDemosdkAaaCciResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDemosdkAaaCciResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDemosdkAaaCciResponse setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

    public QueryAntchainDemosdkAaaCciResponse setNum(String num) {
        this.num = num;
        return this;
    }
    public String getNum() {
        return this.num;
    }

}
