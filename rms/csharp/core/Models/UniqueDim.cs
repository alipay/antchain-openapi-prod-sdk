// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 日志过滤列
    public class UniqueDim : TeaModel {
        // 列名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 左起第几个
        [NameInMap("left_index")]
        [Validation(Required=true)]
        public long? LeftIndex { get; set; }

        // 左起字符串
        [NameInMap("left")]
        [Validation(Required=false)]
        public string Left { get; set; }

        // 右至字符串
        [NameInMap("right")]
        [Validation(Required=false)]
        public string Right { get; set; }

        // 列值翻译
        [NameInMap("translate")]
        [Validation(Required=false)]
        public Translate Translate { get; set; }

    }

}
