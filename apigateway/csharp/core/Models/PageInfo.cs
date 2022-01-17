// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // PageInfo
    public class PageInfo : TeaModel {
        // 排序信息
        [NameInMap("order_infos")]
        [Validation(Required=false)]
        public List<OrderInfo> OrderInfos { get; set; }

        // 当前页
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 每页记录数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
