// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 字幕信息
    public class CaptionsInfo : TeaModel {
        // 字幕画面位置x坐标，距左侧
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        // 字幕画面位置y坐标，距上侧
        [NameInMap("y")]
        [Validation(Required=true)]
        public long? Y { get; set; }

        // 字幕框宽度
        [NameInMap("w")]
        [Validation(Required=true)]
        public long? W { get; set; }

        // 字幕框高度
        [NameInMap("h")]
        [Validation(Required=true)]
        public long? H { get; set; }

        // 字幕id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 字幕句子时间节点信息
        [NameInMap("sentences")]
        [Validation(Required=true)]
        public List<Sentence> Sentences { get; set; }

        // 是否自定义字幕样式，默认为false
        [NameInMap("custom_captions")]
        [Validation(Required=false)]
        public bool? CustomCaptions { get; set; }

        // 字幕自定义样式
        [NameInMap("captions_style")]
        [Validation(Required=true)]
        public CaptionsStyle CaptionsStyle { get; set; }

        // 字幕拆分字数，默认为单句在画面中不拆分。
        [NameInMap("split_words")]
        [Validation(Required=false)]
        public long? SplitWords { get; set; }

    }

}
