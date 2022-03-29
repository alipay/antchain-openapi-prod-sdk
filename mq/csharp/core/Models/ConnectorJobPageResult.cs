// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 连接器任务分页查询结果
    public class ConnectorJobPageResult : TeaModel {
        // 任务信息列表
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<ConnectorJobInfo> Content { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页的数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 数据总数
        [NameInMap("total_size")]
        [Validation(Required=true)]
        public long? TotalSize { get; set; }

    }

}
