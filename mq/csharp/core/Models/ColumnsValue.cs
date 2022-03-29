// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 一行字段的值
    public class ColumnsValue : TeaModel {
        // 一行的值
        [NameInMap("value")]
        [Validation(Required=true)]
        public List<ColumnValue> Value { get; set; }

    }

}
