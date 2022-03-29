// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 队列规则信息以及分页信息
    public class QueueLimitRulesPageDTO : TeaModel {
        // 总页数
        [NameInMap("page_count")]
        [Validation(Required=true)]
        public long? PageCount { get; set; }

        // 当前页
        [NameInMap("page_current")]
        [Validation(Required=true)]
        public long? PageCurrent { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总记录数
        [NameInMap("row_count")]
        [Validation(Required=true)]
        public long? RowCount { get; set; }

        // 队列规则信息
        [NameInMap("records")]
        [Validation(Required=true)]
        public List<QueueLimitRulesDTO> Records { get; set; }

    }

}
