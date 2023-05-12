// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 排序
    public class OrderByParams : TeaModel {
        // 排序字段
        [NameInMap("order_name")]
        [Validation(Required=true)]
        public string OrderName { get; set; }

        // asc 正序  desc 倒序
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

    }

}
