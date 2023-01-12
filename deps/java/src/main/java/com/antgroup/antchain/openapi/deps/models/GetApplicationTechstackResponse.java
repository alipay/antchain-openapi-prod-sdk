// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationTechstackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 技术栈框架
    @NameInMap("techstack")
    @Validation(required = true)
    public Techstack techstack;

    public static GetApplicationTechstackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationTechstackResponse self = new GetApplicationTechstackResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationTechstackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApplicationTechstackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApplicationTechstackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApplicationTechstackResponse setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

}
