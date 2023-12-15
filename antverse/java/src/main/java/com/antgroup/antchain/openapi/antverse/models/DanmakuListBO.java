// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class DanmakuListBO extends TeaModel {
    // 弹幕内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 用户昵称
    @NameInMap("nick_name")
    public String nickName;

    // 发送时间戳(ms)
    @NameInMap("send_time")
    @Validation(required = true)
    public Long sendTime;

    // 直播平台code
    @NameInMap("room_type")
    @Validation(required = true)
    public String roomType;

    public static DanmakuListBO build(java.util.Map<String, ?> map) throws Exception {
        DanmakuListBO self = new DanmakuListBO();
        return TeaModel.build(map, self);
    }

    public DanmakuListBO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DanmakuListBO setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public DanmakuListBO setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

    public DanmakuListBO setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }
    public String getRoomType() {
        return this.roomType;
    }

}
