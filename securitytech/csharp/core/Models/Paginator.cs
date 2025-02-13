// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 分页器
    public class Paginator : TeaModel {
        // 当前页
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 单页项数
        [NameInMap("items_per_page")]
        [Validation(Required=true)]
        public long? ItemsPerPage { get; set; }

        // 总项数
        [NameInMap("items")]
        [Validation(Required=true)]
        public long? Items { get; set; }

    }

}
