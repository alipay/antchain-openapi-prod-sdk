// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RenderInnerTemplateinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实例化成功时返回唯一业务id
    @NameInMap("business_id")
    public String businessId;

    public static RenderInnerTemplateinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderInnerTemplateinstanceResponse self = new RenderInnerTemplateinstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenderInnerTemplateinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RenderInnerTemplateinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RenderInnerTemplateinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RenderInnerTemplateinstanceResponse setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

}
