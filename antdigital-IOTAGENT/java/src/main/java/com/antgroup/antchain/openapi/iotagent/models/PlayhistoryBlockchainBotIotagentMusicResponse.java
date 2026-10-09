// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class PlayhistoryBlockchainBotIotagentMusicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 历史歌曲列表
    @NameInMap("songs")
    public java.util.List<AgentMusicSong> songs;

    // 总数
    @NameInMap("total")
    public Long total;

    public static PlayhistoryBlockchainBotIotagentMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        PlayhistoryBlockchainBotIotagentMusicResponse self = new PlayhistoryBlockchainBotIotagentMusicResponse();
        return TeaModel.build(map, self);
    }

    public PlayhistoryBlockchainBotIotagentMusicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PlayhistoryBlockchainBotIotagentMusicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PlayhistoryBlockchainBotIotagentMusicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PlayhistoryBlockchainBotIotagentMusicResponse setSongs(java.util.List<AgentMusicSong> songs) {
        this.songs = songs;
        return this;
    }
    public java.util.List<AgentMusicSong> getSongs() {
        return this.songs;
    }

    public PlayhistoryBlockchainBotIotagentMusicResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
