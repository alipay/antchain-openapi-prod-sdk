// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ba5301f7d07245d1bd01dc432d3de4b1.models;

import com.aliyun.tea.*;

public class ReplaceDemoSaasTestTestjResponse extends TeaModel {
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
    @NameInMap("age")
    public String age;

    public static ReplaceDemoSaasTestTestjResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDemoSaasTestTestjResponse self = new ReplaceDemoSaasTestTestjResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceDemoSaasTestTestjResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReplaceDemoSaasTestTestjResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReplaceDemoSaasTestTestjResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReplaceDemoSaasTestTestjResponse setAge(String age) {
        this.age = age;
        return this;
    }
    public String getAge() {
        return this.age;
    }

}
