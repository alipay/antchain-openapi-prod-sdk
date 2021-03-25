// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 租户的备付金列表
    public class DiscreteValue : TeaModel {
        // 序号
        [NameInMap("sort_id")]
        [Validation(Required=true)]
        public long? SortId { get; set; }

        // 文本信息
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 文本值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
