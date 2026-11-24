// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BindIotsuccessProductPluginResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("bound_ids")
    @Validation(required = true)
    public java.util.List<String> boundIds;

    // 枚举:NEXT_INTERACTION
    @NameInMap("effective_for")
    @Validation(required = true)
    public String effectiveFor;

    public static BindIotsuccessProductPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        BindIotsuccessProductPluginResponse self = new BindIotsuccessProductPluginResponse();
        return TeaModel.build(map, self);
    }

    public BindIotsuccessProductPluginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindIotsuccessProductPluginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindIotsuccessProductPluginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindIotsuccessProductPluginResponse setBoundIds(java.util.List<String> boundIds) {
        this.boundIds = boundIds;
        return this;
    }
    public java.util.List<String> getBoundIds() {
        return this.boundIds;
    }

    public BindIotsuccessProductPluginResponse setEffectiveFor(String effectiveFor) {
        this.effectiveFor = effectiveFor;
        return this;
    }
    public String getEffectiveFor() {
        return this.effectiveFor;
    }

}
