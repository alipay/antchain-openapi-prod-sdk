// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api请求参数体
    public class ApiParamRequest : TeaModel {
        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // api版本
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

        // 参数名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 目标名称
        [NameInMap("target_name")]
        [Validation(Required=false)]
        public string TargetName { get; set; }

        // 参数类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 链表信息
        [NameInMap("list_item")]
        [Validation(Required=false)]
        public List<ListItem> ListItem { get; set; }

        // 参数示例
        [NameInMap("example")]
        [Validation(Required=false)]
        public string Example { get; set; }

        // 参数描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 结构体名称
        [NameInMap("struct_name")]
        [Validation(Required=false)]
        public string StructName { get; set; }

        // 最大值
        [NameInMap("maximum")]
        [Validation(Required=false)]
        public long? Maximum { get; set; }

        // 最小值
        [NameInMap("minimum")]
        [Validation(Required=false)]
        public long? Minimum { get; set; }

        // 最大长度
        [NameInMap("max_length")]
        [Validation(Required=false)]
        public long? MaxLength { get; set; }

        // 最小长度
        [NameInMap("min_length")]
        [Validation(Required=false)]
        public long? MinLength { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 特性
        [NameInMap("feature")]
        [Validation(Required=true)]
        public string Feature { get; set; }

    }

}
