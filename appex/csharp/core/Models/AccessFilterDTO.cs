// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 访问权限过滤器
    public class AccessFilterDTO : TeaModel {
        // 过滤器名称
        [NameInMap("filter_name")]
        [Validation(Required=true)]
        public string FilterName { get; set; }

        // 要过滤的字段路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 路径字段的取值范围
        [NameInMap("target")]
        [Validation(Required=true)]
        public List<string> Target { get; set; }

    }

}
