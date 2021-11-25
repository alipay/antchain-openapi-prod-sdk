// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CheckSessionAliveResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户id
    @NameInMap("user_id")
    public Long userId;

    // 登录时间
    @NameInMap("login_time")
    public String loginTime;

    // 添加用户类型
    @NameInMap("user_data")
    public UserData userData;

    // did
    @NameInMap("did")
    public String did;

    public static CheckSessionAliveResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSessionAliveResponse self = new CheckSessionAliveResponse();
        return TeaModel.build(map, self);
    }

    public CheckSessionAliveResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckSessionAliveResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckSessionAliveResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckSessionAliveResponse setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public CheckSessionAliveResponse setLoginTime(String loginTime) {
        this.loginTime = loginTime;
        return this;
    }
    public String getLoginTime() {
        return this.loginTime;
    }

    public CheckSessionAliveResponse setUserData(UserData userData) {
        this.userData = userData;
        return this;
    }
    public UserData getUserData() {
        return this.userData;
    }

    public CheckSessionAliveResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
