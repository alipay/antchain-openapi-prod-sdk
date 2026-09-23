// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TestAgenticnexusDemoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 问候语
    @NameInMap("greet")
    public String greet;

    public static TestAgenticnexusDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAgenticnexusDemoResponse self = new TestAgenticnexusDemoResponse();
        return TeaModel.build(map, self);
    }

    public TestAgenticnexusDemoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TestAgenticnexusDemoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TestAgenticnexusDemoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TestAgenticnexusDemoResponse setGreet(String greet) {
        this.greet = greet;
        return this;
    }
    public String getGreet() {
        return this.greet;
    }

}
