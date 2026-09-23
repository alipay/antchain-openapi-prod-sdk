// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TestAgenticnesxusDemoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 基础项目搭建-测试项目连通性
    @NameInMap("greet")
    public String greet;

    public static TestAgenticnesxusDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAgenticnesxusDemoResponse self = new TestAgenticnesxusDemoResponse();
        return TeaModel.build(map, self);
    }

    public TestAgenticnesxusDemoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TestAgenticnesxusDemoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TestAgenticnesxusDemoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TestAgenticnesxusDemoResponse setGreet(String greet) {
        this.greet = greet;
        return this;
    }
    public String getGreet() {
        return this.greet;
    }

}
