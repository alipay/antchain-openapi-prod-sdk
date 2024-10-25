// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 字幕样式
    public class CaptionsStyle : TeaModel {
        // 字体类型
        [NameInMap("font_type")]
        [Validation(Required=true)]
        public string FontType { get; set; }

        // 字体大小，像素单位
        [NameInMap("font_size")]
        [Validation(Required=true)]
        public long? FontSize { get; set; }

        // 字体颜色
        [NameInMap("font_color")]
        [Validation(Required=true)]
        public string FontColor { get; set; }

        // 描边颜色
        [NameInMap("stroke_color")]
        [Validation(Required=false)]
        public string StrokeColor { get; set; }

        // 描边宽度
        [NameInMap("stroke_width")]
        [Validation(Required=false)]
        public long? StrokeWidth { get; set; }

        // 字体背景颜色
        [NameInMap("background_color")]
        [Validation(Required=false)]
        public string BackgroundColor { get; set; }

    }

}
