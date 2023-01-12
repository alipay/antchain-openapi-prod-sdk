// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class EnabledApplicationServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否启用
    @NameInMap("is_enabled")
    public Boolean isEnabled;

    public static EnabledApplicationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnabledApplicationServiceResponse self = new EnabledApplicationServiceResponse();
        return TeaModel.build(map, self);
    }

    public EnabledApplicationServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EnabledApplicationServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EnabledApplicationServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EnabledApplicationServiceResponse setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

}
