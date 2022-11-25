// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    // 阿里云查询数字权证列表结果
    public class AliYunDigitalProjectListView : TeaModel {
        // 分页编号
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 单页行数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 数据总行数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

        // 查询结果列表
        [NameInMap("project_list")]
        [Validation(Required=false)]
        public List<DigitalProjectList> ProjectList { get; set; }

    }

}
