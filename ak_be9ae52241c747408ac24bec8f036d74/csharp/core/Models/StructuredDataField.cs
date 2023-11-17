// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 字段的元信息
    public class StructuredDataField : TeaModel {
        // 字段名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 字段描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 字段类型。
        // 示例如下：
        // STRING,
        // INTEGER,
        // DOUBLE,
        // BOOLEAN
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 字段是否可为空
        [NameInMap("nullable")]
        [Validation(Required=false)]
        public bool? Nullable { get; set; }

    }

}
