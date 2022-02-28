// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    // 从产品动态加载返回结果集
    public class DiscreteValue : TeaModel {
        // 组件展示的内容
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 组件的具体值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 组件值的单位
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 组件选中值的说明/提示
        [NameInMap("tips")]
        [Validation(Required=false)]
        public string Tips { get; set; }

        // 多个组件展示的顺序
        [NameInMap("sort_id")]
        [Validation(Required=true)]
        public long? SortId { get; set; }

    }

}
