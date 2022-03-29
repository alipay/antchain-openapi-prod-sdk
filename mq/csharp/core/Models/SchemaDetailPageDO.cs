// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // schema详情分页类型
    public class SchemaDetailPageDO : TeaModel {
        // 页面数量
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<SchemaDetailDO> Content { get; set; }

    }

}
