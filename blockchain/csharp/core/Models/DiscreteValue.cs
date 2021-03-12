// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 组件信息
    public class DiscreteValue : TeaModel {
        // 排序id
        [NameInMap("sort_id")]
        [Validation(Required=false)]
        public long? SortId { get; set; }

        // 字段描述
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 提示信息
        [NameInMap("tips")]
        [Validation(Required=false)]
        public string Tips { get; set; }

        // 单位信息
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 值内容
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
