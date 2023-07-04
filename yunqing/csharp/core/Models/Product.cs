// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品元信息
    public class Product : TeaModel {
        // 数据库变更
        [NameInMap("database")]
        [Validation(Required=true)]
        public List<DatabaseSchema> Database { get; set; }

        // 产品元信息
        [NameInMap("meta")]
        [Validation(Required=true)]
        public ProductMeta Meta { get; set; }

        // 产品共享参数
        [NameInMap("parameters")]
        [Validation(Required=false)]
        public List<Parameter> Parameters { get; set; }

    }

}
