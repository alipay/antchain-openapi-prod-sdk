// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 应用详情页面
    public class ApplicationPageDescDTO : TeaModel {
        // 总页数
        [NameInMap("page_count")]
        [Validation(Required=true)]
        public long? PageCount { get; set; }

        // 当前页
        [NameInMap("page_current")]
        [Validation(Required=true)]
        public long? PageCurrent { get; set; }

        // 页面显示数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 页面记录
        [NameInMap("records")]
        [Validation(Required=true)]
        public List<ApplicationDTO> Records { get; set; }

        // 总记录数
        [NameInMap("row_count")]
        [Validation(Required=true)]
        public long? RowCount { get; set; }

    }

}
