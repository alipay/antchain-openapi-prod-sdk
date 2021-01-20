// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用额外元数据信息
    public class AppExtraInfo : TeaModel {
        // 应用额外元数据名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 元数据类型为 TEXT, USER 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 元数据值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
