// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 分区详情分页结果
    public class ConnectorJobPartitionStatusPageResult : TeaModel {
        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 数据总数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

        // 分区状态
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<ColumnsValue> Content { get; set; }

    }

}
