// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品实例元数据
    public class ProductInstanceMeta : TeaModel {
        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 产品Code
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 实例名称，同一个ns下不可重复
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
