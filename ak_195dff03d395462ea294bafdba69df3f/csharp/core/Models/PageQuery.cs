// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 分页查询对象
    public class PageQuery : TeaModel {
        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 当前页
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

    }

}
