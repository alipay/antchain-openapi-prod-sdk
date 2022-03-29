// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 日志过滤规则
    public class Filter : TeaModel {
        // 过滤列
        [NameInMap("dim")]
        [Validation(Required=true)]
        public UniqueDim Dim { get; set; }

        // 过滤目标值列表
        [NameInMap("values")]
        [Validation(Required=true)]
        public List<string> Values { get; set; }

    }

}
