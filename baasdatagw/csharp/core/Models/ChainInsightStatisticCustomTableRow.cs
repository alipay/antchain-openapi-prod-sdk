// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察表格行
    public class ChainInsightStatisticCustomTableRow : TeaModel {
        // 表格的一行
        [NameInMap("row")]
        [Validation(Required=true)]
        public List<MapEntry> Row { get; set; }

    }

}
