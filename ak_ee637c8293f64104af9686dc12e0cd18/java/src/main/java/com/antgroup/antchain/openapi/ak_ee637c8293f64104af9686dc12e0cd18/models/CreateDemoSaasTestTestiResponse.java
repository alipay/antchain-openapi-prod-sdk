// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ee637c8293f64104af9686dc12e0cd18.models;

import com.aliyun.tea.*;

public class CreateDemoSaasTestTestiResponse extends TeaModel {
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

    public static CreateDemoSaasTestTestiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoSaasTestTestiResponse self = new CreateDemoSaasTestTestiResponse();
        return TeaModel.build(map, self);
    }

    public CreateDemoSaasTestTestiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDemoSaasTestTestiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDemoSaasTestTestiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDemoSaasTestTestiResponse setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

}
