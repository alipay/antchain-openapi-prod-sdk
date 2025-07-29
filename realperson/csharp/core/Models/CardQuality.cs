// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 卡证OCR图片质量
    public class CardQuality : TeaModel {
        // 1-清晰
        // 0-不清晰
        // 
        [NameInMap("is_clear")]
        [Validation(Required=false)]
        public string IsClear { get; set; }

        // 清晰度取值0-1，值越大表示图像质量越好，默认阈值0.5
        [NameInMap("is_clear_propobility")]
        [Validation(Required=false)]
        public string IsClearPropobility { get; set; }

        // 1-边框/四角完整
        // 0-边框/四角不完整
        [NameInMap("is_complete")]
        [Validation(Required=false)]
        public string IsComplete { get; set; }

        // 取值0-1，值越大表示图像质量越好，默认阈值0.5
        [NameInMap("is_complete_propobility")]
        [Validation(Required=false)]
        public string IsCompletePropobility { get; set; }

        // 1-头像、关键字段无遮挡/马赛克
        // 0-头像、关键字段有遮挡/马赛克
        [NameInMap("is_no_cover")]
        [Validation(Required=false)]
        public string IsNoCover { get; set; }

        // 有无遮挡propobility-取值0-1，值越大表示图像质量越好，默认阈值0.3
        [NameInMap("is_no_cover_propobility")]
        [Validation(Required=false)]
        public string IsNoCoverPropobility { get; set; }

    }

}
