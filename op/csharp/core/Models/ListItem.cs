// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // 数组元素类型
    public class ListItem : TeaModel {
        // 参数类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 结构体名称
        [NameInMap("struct_name")]
        [Validation(Required=false)]
        public string StructName { get; set; }

        // 参数示例
        [NameInMap("example")]
        [Validation(Required=false)]
        public string Example { get; set; }

        // 整数最大值
        [NameInMap("maximum")]
        [Validation(Required=false)]
        public long? Maximum { get; set; }

        // 是否包括最大值
        [NameInMap("exclusive_maximum")]
        [Validation(Required=false)]
        public bool? ExclusiveMaximum { get; set; }

        // 最小值
        [NameInMap("minimum")]
        [Validation(Required=false)]
        public long? Minimum { get; set; }

        // 是否包括最小值
        [NameInMap("exclusive_minimum")]
        [Validation(Required=false)]
        public bool? ExclusiveMinimum { get; set; }

        // 最大长度
        [NameInMap("max_length")]
        [Validation(Required=false)]
        public long? MaxLength { get; set; }

        // 最小长度
        [NameInMap("min_length")]
        [Validation(Required=false)]
        public long? MinLength { get; set; }

        // 模式
        [NameInMap("pattern")]
        [Validation(Required=false)]
        public string Pattern { get; set; }

        // 最大元素个数
        [NameInMap("max_items")]
        [Validation(Required=false)]
        public long? MaxItems { get; set; }

        // 最小元素数目
        [NameInMap("min_items")]
        [Validation(Required=false)]
        public long? MinItems { get; set; }

        // 枚举类型
        [NameInMap("enum_values")]
        [Validation(Required=false)]
        public string EnumValues { get; set; }

    }

}
