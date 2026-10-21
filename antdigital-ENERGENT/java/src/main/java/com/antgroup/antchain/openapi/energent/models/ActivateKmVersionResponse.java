// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class ActivateKmVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 当前激活版本ID
    @NameInMap("active_version_id")
    public String activeVersionId;

    // 激活时间
    @NameInMap("active_time")
    public String activeTime;

    public static ActivateKmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateKmVersionResponse self = new ActivateKmVersionResponse();
        return TeaModel.build(map, self);
    }

    public ActivateKmVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ActivateKmVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ActivateKmVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ActivateKmVersionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ActivateKmVersionResponse setActiveVersionId(String activeVersionId) {
        this.activeVersionId = activeVersionId;
        return this;
    }
    public String getActiveVersionId() {
        return this.activeVersionId;
    }

    public ActivateKmVersionResponse setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

}
