// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客流向数据返回数据对象
    public class GdCustomerInfo : TeaModel {
        // 时间范围（查询年度数据时，返回该字段）
        [NameInMap("time_range")]
        [Validation(Required=false)]
        public string TimeRange { get; set; }

        // 数据总数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 当前展示页
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 数据总页数
        [NameInMap("pages")]
        [Validation(Required=true)]
        public long? Pages { get; set; }

        // 每页显示数据条数
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // 数据集合
        [NameInMap("records")]
        [Validation(Required=true)]
        public List<GdCustomersRecord> Records { get; set; }

    }

}
