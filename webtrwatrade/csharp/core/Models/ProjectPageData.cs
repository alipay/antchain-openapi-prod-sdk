// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 项目分页信息
    public class ProjectPageData : TeaModel {
        // 总记录数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 总页数
        [NameInMap("page_count")]
        [Validation(Required=true)]
        public long? PageCount { get; set; }

        // 当前页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 项目列表
        [NameInMap("records")]
        [Validation(Required=true)]
        public List<AssetProject> Records { get; set; }

    }

}
