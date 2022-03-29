// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // UIComponent的内容
    public class ComponentContent : TeaModel {
        // 文本内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 超链接
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 是否粗体
        [NameInMap("bold")]
        [Validation(Required=true)]
        public bool? Bold { get; set; }

    }

}
