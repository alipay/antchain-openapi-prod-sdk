// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 任务列表分页结构体
    public class PageTaskListDTO : TeaModel {
        // 任务列表集合
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<TaskListInfoDTO> Content { get; set; }

        // 总记录条目
        [NameInMap("total_elements")]
        [Validation(Required=true)]
        public long? TotalElements { get; set; }

        // 记录总页数
        [NameInMap("total_pages")]
        [Validation(Required=true)]
        public long? TotalPages { get; set; }

        // 页码
        [NameInMap("number")]
        [Validation(Required=true)]
        public long? Number { get; set; }

        // 每页记录条目
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // 每页元素个数
        [NameInMap("number_of_elements")]
        [Validation(Required=true)]
        public long? NumberOfElements { get; set; }

    }

}
