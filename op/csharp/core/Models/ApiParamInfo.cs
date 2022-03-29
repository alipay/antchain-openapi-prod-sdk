// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api参数信息
    public class ApiParamInfo : TeaModel {
        // api名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // api类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 示例
        [NameInMap("example")]
        [Validation(Required=true)]
        public string Example { get; set; }

        // api描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 结构体名称
        [NameInMap("struct_name")]
        [Validation(Required=true)]
        public string StructName { get; set; }

        // 最大数字
        [NameInMap("maximum")]
        [Validation(Required=true)]
        public long? Maximum { get; set; }

        // 最小数字
        [NameInMap("minimum")]
        [Validation(Required=true)]
        public long? Minimum { get; set; }

        // 字符串最大长度
        [NameInMap("max_length")]
        [Validation(Required=true)]
        public long? MaxLength { get; set; }

        // 最小长度
        [NameInMap("min_length")]
        [Validation(Required=true)]
        public bool? MinLength { get; set; }

        //  是否支持传输文件
        [NameInMap("file_transfer")]
        [Validation(Required=true)]
        public bool? FileTransfer { get; set; }

        // 是否为必填字段
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

    }

}
