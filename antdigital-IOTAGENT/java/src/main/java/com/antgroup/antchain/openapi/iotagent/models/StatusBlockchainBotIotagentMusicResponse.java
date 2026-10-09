// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class StatusBlockchainBotIotagentMusicResponse extends TeaModel {
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

    public static StatusBlockchainBotIotagentMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        StatusBlockchainBotIotagentMusicResponse self = new StatusBlockchainBotIotagentMusicResponse();
        return TeaModel.build(map, self);
    }

    public StatusBlockchainBotIotagentMusicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StatusBlockchainBotIotagentMusicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StatusBlockchainBotIotagentMusicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StatusBlockchainBotIotagentMusicResponse setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public StatusBlockchainBotIotagentMusicResponse setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public StatusBlockchainBotIotagentMusicResponse setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public StatusBlockchainBotIotagentMusicResponse setGender(Long gender) {
        this.gender = gender;
        return this;
    }
    public Long getGender() {
        return this.gender;
    }

    public StatusBlockchainBotIotagentMusicResponse setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public StatusBlockchainBotIotagentMusicResponse setVipExpireTime(Long vipExpireTime) {
        this.vipExpireTime = vipExpireTime;
        return this;
    }
    public Long getVipExpireTime() {
        return this.vipExpireTime;
    }

}
