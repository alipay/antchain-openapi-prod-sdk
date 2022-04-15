// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 钉钉Markdown
    public class Markdown : TeaModel {
        // 标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 内容
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

    }

}
