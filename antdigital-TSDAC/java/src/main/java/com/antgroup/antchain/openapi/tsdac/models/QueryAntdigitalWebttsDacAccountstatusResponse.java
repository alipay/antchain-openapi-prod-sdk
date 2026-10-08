// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacAccountstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // MasterAccount的状态: ACTIVE、FROZEN、DEACTIVATED
    @NameInMap("account_status")
    public String accountStatus;

    // 用户状态: ACTIVE、DEACTIVATED
    @NameInMap("user_status")
    public String userStatus;

    public static QueryAntdigitalWebttsDacAccountstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacAccountstatusResponse self = new QueryAntdigitalWebttsDacAccountstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacAccountstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalWebttsDacAccountstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalWebttsDacAccountstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalWebttsDacAccountstatusResponse setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public QueryAntdigitalWebttsDacAccountstatusResponse setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
