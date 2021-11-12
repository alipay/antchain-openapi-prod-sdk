// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DescribeSolutioninstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支持的api列表
    @NameInMap("supported_actions")
    public java.util.List<OpenAPI> supportedActions;

    public static DescribeSolutioninstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSolutioninstanceResponse self = new DescribeSolutioninstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSolutioninstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeSolutioninstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeSolutioninstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeSolutioninstanceResponse setSupportedActions(java.util.List<OpenAPI> supportedActions) {
        this.supportedActions = supportedActions;
        return this;
    }
    public java.util.List<OpenAPI> getSupportedActions() {
        return this.supportedActions;
    }

}
