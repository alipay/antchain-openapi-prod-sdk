// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 列值翻译映射关系
    public class TranslateMapping : TeaModel {
        // 原始列值
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 翻译后列值
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 正则类型 (完整正则或简单正则)
        [NameInMap("mode")]
        [Validation(Required=true)]
        public string Mode { get; set; }

    }

}
