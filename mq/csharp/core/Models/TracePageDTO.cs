// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 查询到的trace信息集合
    public class TracePageDTO : TeaModel {
        // Trace 信息
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<TraceDTO> Content { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总条数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
