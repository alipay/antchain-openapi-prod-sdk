// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_565b634e3a95498e8d64367689cda6ad.models;

import com.aliyun.tea.*;

public class OpenDemoSaasTestTestgResponse extends TeaModel {
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
    @NameInMap("sex")
    public String sex;

    public static OpenDemoSaasTestTestgResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDemoSaasTestTestgResponse self = new OpenDemoSaasTestTestgResponse();
        return TeaModel.build(map, self);
    }

    public OpenDemoSaasTestTestgResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OpenDemoSaasTestTestgResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenDemoSaasTestTestgResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OpenDemoSaasTestTestgResponse setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

}
