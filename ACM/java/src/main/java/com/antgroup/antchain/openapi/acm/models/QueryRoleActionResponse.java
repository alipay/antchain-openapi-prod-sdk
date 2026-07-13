// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryRoleActionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回有权限的权限点
    @NameInMap("actions")
    public java.util.List<Action> actions;

    public static QueryRoleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRoleActionResponse self = new QueryRoleActionResponse();
        return TeaModel.build(map, self);
    }

    public QueryRoleActionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRoleActionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRoleActionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRoleActionResponse setActions(java.util.List<Action> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<Action> getActions() {
        return this.actions;
    }

}
