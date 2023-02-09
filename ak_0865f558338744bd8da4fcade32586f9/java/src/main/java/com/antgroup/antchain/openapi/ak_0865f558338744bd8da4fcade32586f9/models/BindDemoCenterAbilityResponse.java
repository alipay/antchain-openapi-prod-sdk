// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_0865f558338744bd8da4fcade32586f9.models;

import com.aliyun.tea.*;

public class BindDemoCenterAbilityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static BindDemoCenterAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDemoCenterAbilityResponse self = new BindDemoCenterAbilityResponse();
        return TeaModel.build(map, self);
    }

    public BindDemoCenterAbilityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindDemoCenterAbilityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindDemoCenterAbilityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
