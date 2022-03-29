// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 列名称
    public class ColumnName : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 唯一ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 值类型
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

    }

}
