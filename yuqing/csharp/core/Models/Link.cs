// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 钉钉链接消息
    public class Link : TeaModel {
        // 文字
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // 标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 图片地址
        [NameInMap("pic_url")]
        [Validation(Required=false)]
        public string PicUrl { get; set; }

        // 链接
        [NameInMap("message_url")]
        [Validation(Required=false)]
        public string MessageUrl { get; set; }

    }

}
