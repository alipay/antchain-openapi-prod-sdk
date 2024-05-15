// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 存证数据字段值
    public class DepositFieldValue : TeaModel {
        // 存证数据字段名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 存证数据字段值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
