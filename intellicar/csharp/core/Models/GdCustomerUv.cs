// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客uv指数
    public class GdCustomerUv : TeaModel {
        // uv指数数量
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // uv指数数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // uv指数排序
        // 
        [NameInMap("sort")]
        [Validation(Required=true)]
        public long? Sort { get; set; }

    }

}
