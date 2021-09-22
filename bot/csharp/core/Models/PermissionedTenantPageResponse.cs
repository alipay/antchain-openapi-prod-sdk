// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 租户分页查询结果
    public class PermissionedTenantPageResponse : TeaModel {
        // 页数
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // 页码
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总记录数
        [NameInMap("total_size")]
        [Validation(Required=true)]
        public long? TotalSize { get; set; }

        // 总页数
        [NameInMap("total_pages")]
        [Validation(Required=true)]
        public long? TotalPages { get; set; }

        // 数据
        [NameInMap("page_data")]
        [Validation(Required=true)]
        public List<PermissionedTenantModel> PageData { get; set; }

    }

}
