// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 安全组件简报
    public class ClusterSecurityComponentBrief : TeaModel {
        // 风险项数量
        [NameInMap("cnt")]
        [Validation(Required=false)]
        public long? Cnt { get; set; }

        // 组件名称
        [NameInMap("component")]
        [Validation(Required=false)]
        public string Component { get; set; }

        // 描述
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 日期
        [NameInMap("date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Date { get; set; }

    }

}
