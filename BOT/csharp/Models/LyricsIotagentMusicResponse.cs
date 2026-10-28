// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class LyricsIotagentMusicResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 原文歌词（带时间戳）
        [NameInMap("lyric")]
        [Validation(Required=false)]
        public string Lyric { get; set; }

        // 译文歌词
        [NameInMap("trans_lyric")]
        [Validation(Required=false)]
        public string TransLyric { get; set; }

        // 纯文本歌词
        [NameInMap("txt_lyric")]
        [Validation(Required=false)]
        public string TxtLyric { get; set; }

        // 是否无歌词（true=无歌词）
        [NameInMap("no_lyric")]
        [Validation(Required=false)]
        public bool? NoLyric { get; set; }

    }

}
