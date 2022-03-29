// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // 参数模型
    public class ParamModal : TeaModel {
        // api meta数据id
        [NameInMap("api_meta_id")]
        [Validation(Required=true)]
        public string ApiMetaId { get; set; }

        // api版本id
        [NameInMap("api_version_id")]
        [Validation(Required=true)]
        public string ApiVersionId { get; set; }

        // 数组参数
        [NameInMap("list_item")]
        [Validation(Required=false)]
        public List<ListItem> ListItem { get; set; }

        // 结构体id
        [NameInMap("field_struct_id")]
        [Validation(Required=false)]
        public string FieldStructId { get; set; }

        // 结构体名称
        [NameInMap("field_struct_name")]
        [Validation(Required=false)]
        public string FieldStructName { get; set; }

        // 参数示例
        [NameInMap("example")]
        [Validation(Required=false)]
        public string Example { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 最大整数长度
        [NameInMap("maximum")]
        [Validation(Required=false)]
        public long? Maximum { get; set; }

        // 是否包括最大值
        [NameInMap("exclusive_maximum")]
        [Validation(Required=false)]
        public bool? ExclusiveMaximum { get; set; }

        // 整数的最小值
        [NameInMap("minimum")]
        [Validation(Required=false)]
        public long? Minimum { get; set; }

        // 是否排除最小值
        [NameInMap("exclusive_minimum")]
        [Validation(Required=false)]
        public bool? ExclusiveMinimum { get; set; }

        // 字符串的最大长度
        [NameInMap("max_length")]
        [Validation(Required=false)]
        public long? MaxLength { get; set; }

        // 字符串的最小长度
        [NameInMap("min_length")]
        [Validation(Required=false)]
        public long? MinLength { get; set; }

        // 模式
        [NameInMap("pattern")]
        [Validation(Required=false)]
        public string Pattern { get; set; }

        // 最大元素数目
        [NameInMap("max_items")]
        [Validation(Required=false)]
        public long? MaxItems { get; set; }

        // 最小元素数目
        [NameInMap("min_items")]
        [Validation(Required=false)]
        public long? MinItems { get; set; }

        // 枚举值
        [NameInMap("enum_values")]
        [Validation(Required=false)]
        public string EnumValues { get; set; }

        // 参数名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 参数类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 参数描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 参数特性
        [NameInMap("feature")]
        [Validation(Required=true)]
        public string Feature { get; set; }

    }

}
