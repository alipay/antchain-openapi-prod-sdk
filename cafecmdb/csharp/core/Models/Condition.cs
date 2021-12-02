// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    // 查询的条件
    public class Condition : TeaModel {
        // 用于查询条件的字段
        [NameInMap("field")]
        [Validation(Required=true)]
        public string Field { get; set; }

        // 查询操作符
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 由于OP限制，此字段无法直接使用数组。请务必使用能够解析的JSON数组
        [NameInMap("values")]
        [Validation(Required=true)]
        public string Values { get; set; }

    }

}
