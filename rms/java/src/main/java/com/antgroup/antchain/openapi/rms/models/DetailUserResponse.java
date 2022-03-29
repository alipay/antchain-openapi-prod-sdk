// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DetailUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // auth_url
    @NameInMap("auth_url")
    public String authUrl;

    // user
    @NameInMap("user")
    public MonitorUser user;

    // nav_head
    @NameInMap("nav_head")
    public NavContent navHead;

    public static DetailUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailUserResponse self = new DetailUserResponse();
        return TeaModel.build(map, self);
    }

    public DetailUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailUserResponse setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

    public DetailUserResponse setUser(MonitorUser user) {
        this.user = user;
        return this;
    }
    public MonitorUser getUser() {
        return this.user;
    }

    public DetailUserResponse setNavHead(NavContent navHead) {
        this.navHead = navHead;
        return this;
    }
    public NavContent getNavHead() {
        return this.navHead;
    }

}
