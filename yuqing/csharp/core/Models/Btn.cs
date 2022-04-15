// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 钉钉点击
    public class Btn : TeaModel {
        // 标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 动作地址
        [NameInMap("action_url")]
        [Validation(Required=false)]
        public string ActionUrl { get; set; }

    }

}
