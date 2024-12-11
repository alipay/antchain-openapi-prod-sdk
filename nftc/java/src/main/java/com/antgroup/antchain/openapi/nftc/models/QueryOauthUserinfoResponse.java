// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryOauthUserinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 昵称
    @NameInMap("nick_name")
    public String nickName;

    // 头像链接
    @NameInMap("avatar")
    public String avatar;

    // 用户id
    @NameInMap("open_user_id")
    public String openUserId;

    // 租户下用户id
    @NameInMap("tenant_uid")
    public String tenantUid;

    // 用户手机号
    @NameInMap("phone")
    public String phone;

    // 0-未实名; 1-已实名
    @NameInMap("is_real_name_verified")
    public Long isRealNameVerified;

    public static QueryOauthUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOauthUserinfoResponse self = new QueryOauthUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryOauthUserinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOauthUserinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOauthUserinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOauthUserinfoResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public QueryOauthUserinfoResponse setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public QueryOauthUserinfoResponse setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
        return this;
    }
    public String getOpenUserId() {
        return this.openUserId;
    }

    public QueryOauthUserinfoResponse setTenantUid(String tenantUid) {
        this.tenantUid = tenantUid;
        return this;
    }
    public String getTenantUid() {
        return this.tenantUid;
    }

    public QueryOauthUserinfoResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryOauthUserinfoResponse setIsRealNameVerified(Long isRealNameVerified) {
        this.isRealNameVerified = isRealNameVerified;
        return this;
    }
    public Long getIsRealNameVerified() {
        return this.isRealNameVerified;
    }

}
