// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 查询自定义统计Table指标的返回结果
    public class ChainInsightStatisticCustomTablesResponse : TeaModel {
        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 总条数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 表格每一行内容，    Key 为列名，    Value，列的取值
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<ChainInsightStatisticCustomTableRow> List { get; set; }

    }

}
