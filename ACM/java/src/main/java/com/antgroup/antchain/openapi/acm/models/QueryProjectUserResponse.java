// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryProjectUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户列表
    @NameInMap("users")
    public java.util.List<User> users;

    public static QueryProjectUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectUserResponse self = new QueryProjectUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProjectUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProjectUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProjectUserResponse setUsers(java.util.List<User> users) {
        this.users = users;
        return this;
    }
    public java.util.List<User> getUsers() {
        return this.users;
    }

}
