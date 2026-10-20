// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 智能体云音乐歌曲
    public class AgentMusicSong : TeaModel {
        // 歌曲 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>id123456</para>
        /// </summary>
        [NameInMap("song_id")]
        [Validation(Required=false)]
        public string SongId { get; set; }

        // 歌名
        /// <summary>
        /// <b>Example:</b>
        /// <para>三只松鼠</para>
        /// </summary>
        [NameInMap("song_name")]
        [Validation(Required=false)]
        public string SongName { get; set; }

        // 歌手（多歌手用 / 分隔）
        /// <summary>
        /// <b>Example:</b>
        /// <para>林君杰/周伦</para>
        /// </summary>
        [NameInMap("artist_name")]
        [Validation(Required=false)]
        public string ArtistName { get; set; }

        // 时长(ms)
        /// <summary>
        /// <b>Example:</b>
        /// <para>208888</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // 是否已添加红心
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("is_liked")]
        [Validation(Required=false)]
        public bool? IsLiked { get; set; }

        // 播放标记，取值范围：0=可播放 / 1=不可播放
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("play_flag")]
        [Validation(Required=false)]
        public long? PlayFlag { get; set; }

        // VIP 播放标记，取值范围：0=免费（非 VIP 限制） / 1=VIP 专享
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("vip_play_flag")]
        [Validation(Required=false)]
        public long? VipPlayFlag { get; set; }

        // VIP 标记（0=否，1=是）
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("vip_flag")]
        [Validation(Required=false)]
        public long? VipFlag { get; set; }

        // 收费类型，取值范围：0=免费 / 1=VIP / 4=付费专辑 / 8=低质量免费
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("song_fee")]
        [Validation(Required=false)]
        public long? SongFee { get; set; }

        // 封面 URL
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://p2.music.126.net/t8H-_P4uF567.jpg">http://p2.music.126.net/t8H-_P4uF567.jpg</a></para>
        /// </summary>
        [NameInMap("cover_img_url")]
        [Validation(Required=false)]
        public string CoverImgUrl { get; set; }

        // 可用音质 code 列表，取值范围：vividMusic=Audio Vivid / dolbyMusic=杜比 / skMusic=沉浸环绕声 / jyMasterMusic=超清母带 / jyEffectMusic=高清臻音 / hrMusic=Hi-Res / sqMusic=无损 / hmusic=极高 / mmusic=较高 / lmusic=标准
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;dolbyMusic&quot;,&quot;hrMusic&quot;]</para>
        /// </summary>
        [NameInMap("qualities")]
        [Validation(Required=false)]
        public List<string> Qualities { get; set; }

    }

}
