// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f2ba648e36a44708ab93a511f45f8a19.models;

import com.aliyun.tea.*;

public class BindDemoTestTestTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // test
    @NameInMap("test")
    public String test;

    public static BindDemoTestTestTestResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDemoTestTestTestResponse self = new BindDemoTestTestTestResponse();
        return TeaModel.build(map, self);
    }

    public BindDemoTestTestTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindDemoTestTestTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindDemoTestTestTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindDemoTestTestTestResponse setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
