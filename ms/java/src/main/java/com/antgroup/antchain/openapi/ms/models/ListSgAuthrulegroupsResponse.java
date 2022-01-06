// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgAuthrulegroupsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 鉴权规则组，黑白名单
    @NameInMap("auth_rule_groups")
    public java.util.List<AuthRuleGroupVO> authRuleGroups;

    public static ListSgAuthrulegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgAuthrulegroupsResponse self = new ListSgAuthrulegroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSgAuthrulegroupsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgAuthrulegroupsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgAuthrulegroupsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgAuthrulegroupsResponse setAuthRuleGroups(java.util.List<AuthRuleGroupVO> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<AuthRuleGroupVO> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

}
