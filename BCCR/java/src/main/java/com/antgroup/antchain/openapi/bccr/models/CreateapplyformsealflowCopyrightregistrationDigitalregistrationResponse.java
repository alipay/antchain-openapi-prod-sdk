// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建签署流程是否成功
    @NameInMap("completed")
    public Boolean completed;

    public static CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse self = new CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationResponse setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

}
