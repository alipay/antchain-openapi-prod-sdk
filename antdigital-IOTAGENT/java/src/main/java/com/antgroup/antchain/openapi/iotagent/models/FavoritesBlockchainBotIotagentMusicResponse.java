// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class FavoritesBlockchainBotIotagentMusicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 红心歌曲列表
    @NameInMap("songs")
    public java.util.List<AgentMusicSong> songs;

    public static FavoritesBlockchainBotIotagentMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        FavoritesBlockchainBotIotagentMusicResponse self = new FavoritesBlockchainBotIotagentMusicResponse();
        return TeaModel.build(map, self);
    }

    public FavoritesBlockchainBotIotagentMusicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FavoritesBlockchainBotIotagentMusicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FavoritesBlockchainBotIotagentMusicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FavoritesBlockchainBotIotagentMusicResponse setSongs(java.util.List<AgentMusicSong> songs) {
        this.songs = songs;
        return this;
    }
    public java.util.List<AgentMusicSong> getSongs() {
        return this.songs;
    }

}
