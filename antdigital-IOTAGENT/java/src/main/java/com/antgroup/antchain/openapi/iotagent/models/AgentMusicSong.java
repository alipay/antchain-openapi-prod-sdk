// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class AgentMusicSong extends TeaModel {
    // 歌曲 ID
    /**
     * <strong>example:</strong>
     * <p>id123456</p>
     */
    @NameInMap("song_id")
    public String songId;

    // 歌名
    /**
     * <strong>example:</strong>
     * <p>三只松鼠</p>
     */
    @NameInMap("song_name")
    public String songName;

    // 歌手（多歌手用 / 分隔）
    /**
     * <strong>example:</strong>
     * <p>林君杰/周伦</p>
     */
    @NameInMap("artist_name")
    public String artistName;

    // 时长(ms)
    /**
     * <strong>example:</strong>
     * <p>208888</p>
     */
    @NameInMap("duration")
    public Long duration;

    // 是否已添加红心
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_liked")
    public Boolean isLiked;

    // 播放标记，取值范围：0=可播放 / 1=不可播放
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("play_flag")
    public Long playFlag;

    // VIP 播放标记，取值范围：0=免费（非 VIP 限制） / 1=VIP 专享
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("vip_play_flag")
    public Long vipPlayFlag;

    // VIP 标记（0=否，1=是）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("vip_flag")
    public Long vipFlag;

    // 收费类型，取值范围：0=免费 / 1=VIP / 4=付费专辑 / 8=低质量免费
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("song_fee")
    public Long songFee;

    // 封面 URL
    /**
     * <strong>example:</strong>
     * <p><a href="http://p2.music.126.net/t8H-_P4uF567.jpg">http://p2.music.126.net/t8H-_P4uF567.jpg</a></p>
     */
    @NameInMap("cover_img_url")
    public String coverImgUrl;

    // 可用音质 code 列表，取值范围：vividMusic=Audio Vivid / dolbyMusic=杜比 / skMusic=沉浸环绕声 / jyMasterMusic=超清母带 / jyEffectMusic=高清臻音 / hrMusic=Hi-Res / sqMusic=无损 / hmusic=极高 / mmusic=较高 / lmusic=标准
    /**
     * <strong>example:</strong>
     * <p>[&quot;dolbyMusic&quot;,&quot;hrMusic&quot;]</p>
     */
    @NameInMap("qualities")
    public java.util.List<String> qualities;

    public static AgentMusicSong build(java.util.Map<String, ?> map) throws Exception {
        AgentMusicSong self = new AgentMusicSong();
        return TeaModel.build(map, self);
    }

    public AgentMusicSong setSongId(String songId) {
        this.songId = songId;
        return this;
    }
    public String getSongId() {
        return this.songId;
    }

    public AgentMusicSong setSongName(String songName) {
        this.songName = songName;
        return this;
    }
    public String getSongName() {
        return this.songName;
    }

    public AgentMusicSong setArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }
    public String getArtistName() {
        return this.artistName;
    }

    public AgentMusicSong setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public AgentMusicSong setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
        return this;
    }
    public Boolean getIsLiked() {
        return this.isLiked;
    }

    public AgentMusicSong setPlayFlag(Long playFlag) {
        this.playFlag = playFlag;
        return this;
    }
    public Long getPlayFlag() {
        return this.playFlag;
    }

    public AgentMusicSong setVipPlayFlag(Long vipPlayFlag) {
        this.vipPlayFlag = vipPlayFlag;
        return this;
    }
    public Long getVipPlayFlag() {
        return this.vipPlayFlag;
    }

    public AgentMusicSong setVipFlag(Long vipFlag) {
        this.vipFlag = vipFlag;
        return this;
    }
    public Long getVipFlag() {
        return this.vipFlag;
    }

    public AgentMusicSong setSongFee(Long songFee) {
        this.songFee = songFee;
        return this;
    }
    public Long getSongFee() {
        return this.songFee;
    }

    public AgentMusicSong setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
        return this;
    }
    public String getCoverImgUrl() {
        return this.coverImgUrl;
    }

    public AgentMusicSong setQualities(java.util.List<String> qualities) {
        this.qualities = qualities;
        return this;
    }
    public java.util.List<String> getQualities() {
        return this.qualities;
    }

}
