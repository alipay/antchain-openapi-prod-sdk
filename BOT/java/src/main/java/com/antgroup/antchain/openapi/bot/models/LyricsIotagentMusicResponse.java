// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LyricsIotagentMusicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原文歌词（带时间戳）
    @NameInMap("lyric")
    public String lyric;

    // 译文歌词
    @NameInMap("trans_lyric")
    public String transLyric;

    // 纯文本歌词
    @NameInMap("txt_lyric")
    public String txtLyric;

    // 是否无歌词（true=无歌词）
    @NameInMap("no_lyric")
    public Boolean noLyric;

    public static LyricsIotagentMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        LyricsIotagentMusicResponse self = new LyricsIotagentMusicResponse();
        return TeaModel.build(map, self);
    }

    public LyricsIotagentMusicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public LyricsIotagentMusicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LyricsIotagentMusicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public LyricsIotagentMusicResponse setLyric(String lyric) {
        this.lyric = lyric;
        return this;
    }
    public String getLyric() {
        return this.lyric;
    }

    public LyricsIotagentMusicResponse setTransLyric(String transLyric) {
        this.transLyric = transLyric;
        return this;
    }
    public String getTransLyric() {
        return this.transLyric;
    }

    public LyricsIotagentMusicResponse setTxtLyric(String txtLyric) {
        this.txtLyric = txtLyric;
        return this;
    }
    public String getTxtLyric() {
        return this.txtLyric;
    }

    public LyricsIotagentMusicResponse setNoLyric(Boolean noLyric) {
        this.noLyric = noLyric;
        return this;
    }
    public Boolean getNoLyric() {
        return this.noLyric;
    }

}
