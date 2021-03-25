// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ListOperatorGroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 成员组列表
    @NameInMap("groups")
    public java.util.List<Group> groups;

    public static ListOperatorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperatorGroupResponse self = new ListOperatorGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListOperatorGroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListOperatorGroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListOperatorGroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListOperatorGroupResponse setGroups(java.util.List<Group> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<Group> getGroups() {
        return this.groups;
    }

}
