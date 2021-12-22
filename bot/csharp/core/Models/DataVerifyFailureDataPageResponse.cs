// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 数据校验失败分页查询结果
    public class DataVerifyFailureDataPageResponse : TeaModel {
        // 页数
        // 
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // 页码
        // 
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总记录数
        // 
        [NameInMap("total_size")]
        [Validation(Required=true)]
        public long? TotalSize { get; set; }

        // 总页数
        // 
        [NameInMap("total_pages")]
        [Validation(Required=true)]
        public long? TotalPages { get; set; }

        // 数据
        [NameInMap("page_data")]
        [Validation(Required=true)]
        public List<DataVerifyFailureData> PageData { get; set; }

    }

}
