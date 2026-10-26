// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StatusIotagentMusicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // token 类型，取值范围：NONE=未登录 / ANONYMOUS=匿名 token / FORMAL=正式登录
    @NameInMap("token_type")
    public String tokenType;

    // 昵称
    @NameInMap("nickname")
    public String nickname;

    // 头像 URL
    @NameInMap("avatar_url")
    public String avatarUrl;

    // 性别，取值范围：0=未知 / 1=男 / 2=女
    @NameInMap("gender")
    public Long gender;

    // VIP 类型，取值范围：FREE=非会员 / BLACK_VIP=黑胶 VIP / SVIP=SVIP / SINGLE_DEVICE=单设备会员
    @NameInMap("vip_type")
    public String vipType;

    // VIP 到期时间（毫秒时间戳）
    @NameInMap("vip_expire_time")
    public Long vipExpireTime;

    public static StatusIotagentMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        StatusIotagentMusicResponse self = new StatusIotagentMusicResponse();
        return TeaModel.build(map, self);
    }

    public StatusIotagentMusicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StatusIotagentMusicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StatusIotagentMusicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StatusIotagentMusicResponse setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public StatusIotagentMusicResponse setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public StatusIotagentMusicResponse setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public StatusIotagentMusicResponse setGender(Long gender) {
        this.gender = gender;
        return this;
    }
    public Long getGender() {
        return this.gender;
    }

    public StatusIotagentMusicResponse setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public StatusIotagentMusicResponse setVipExpireTime(Long vipExpireTime) {
        this.vipExpireTime = vipExpireTime;
        return this;
    }
    public Long getVipExpireTime() {
        return this.vipExpireTime;
    }

}
