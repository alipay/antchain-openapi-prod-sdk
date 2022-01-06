// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SaveSgAuthrulegroupsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 一个服务接口的白名单和黑名单
    @NameInMap("auth_rule_groups")
    public java.util.List<AuthRuleGroup> authRuleGroups;

    public static SaveSgAuthrulegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSgAuthrulegroupsResponse self = new SaveSgAuthrulegroupsResponse();
        return TeaModel.build(map, self);
    }

    public SaveSgAuthrulegroupsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveSgAuthrulegroupsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveSgAuthrulegroupsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveSgAuthrulegroupsResponse setAuthRuleGroups(java.util.List<AuthRuleGroup> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<AuthRuleGroup> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

}
