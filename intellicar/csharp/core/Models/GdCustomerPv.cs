// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客record重叠指数pv指数
    public class GdCustomerPv : TeaModel {
        // 重叠指数pv历史指数数量（时间类型为季度、半年、年时，不展示）
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 重叠指数pv指数数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 重叠指数pv指数排序
        [NameInMap("sort")]
        [Validation(Required=true)]
        public long? Sort { get; set; }

    }

}
