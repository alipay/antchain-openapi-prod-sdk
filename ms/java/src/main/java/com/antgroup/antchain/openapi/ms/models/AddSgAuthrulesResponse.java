// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgAuthrulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建成功后的鉴权规则
    @NameInMap("auth_rule")
    public AuthRule authRule;

    public static AddSgAuthrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSgAuthrulesResponse self = new AddSgAuthrulesResponse();
        return TeaModel.build(map, self);
    }

    public AddSgAuthrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddSgAuthrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddSgAuthrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddSgAuthrulesResponse setAuthRule(AuthRule authRule) {
        this.authRule = authRule;
        return this;
    }
    public AuthRule getAuthRule() {
        return this.authRule;
    }

}
