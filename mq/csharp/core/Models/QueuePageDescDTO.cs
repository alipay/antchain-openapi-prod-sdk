// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 队列详情信息以及分页信息
    public class QueuePageDescDTO : TeaModel {
        // 总页数
        [NameInMap("page_count")]
        [Validation(Required=true)]
        public long? PageCount { get; set; }

        // 当前页面
        [NameInMap("page_current")]
        [Validation(Required=true)]
        public long? PageCurrent { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 队列详情信息
        [NameInMap("records")]
        [Validation(Required=true)]
        public List<QueueDescDTO> Records { get; set; }

        // 总记录数
        [NameInMap("row_count")]
        [Validation(Required=true)]
        public long? RowCount { get; set; }

    }

}
