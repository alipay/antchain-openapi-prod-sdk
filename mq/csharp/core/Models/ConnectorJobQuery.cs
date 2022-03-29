// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 连接器任务查询条件
    public class ConnectorJobQuery : TeaModel {
        // 任务名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 任务状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 排序的列
        [NameInMap("sort_column")]
        [Validation(Required=false)]
        public string SortColumn { get; set; }

        // increment代表升序排序，decrement代表降序排序。
        // 
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public string SortType { get; set; }

        // 应用名
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 审批状态
        [NameInMap("process_status")]
        [Validation(Required=false)]
        public string ProcessStatus { get; set; }

    }

}
