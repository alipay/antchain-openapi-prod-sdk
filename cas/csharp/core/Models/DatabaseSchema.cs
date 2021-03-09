// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // db schema
    public class DatabaseSchema : TeaModel {
        // 字符集
        [NameInMap("char_set")]
        [Validation(Required=true)]
        public string CharSet { get; set; }

        // 数量
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 是否自动生成名称。默认为 true
        [NameInMap("is_auto_name")]
        [Validation(Required=false)]
        public bool? IsAutoName { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 序列号是否连续。默认为 false
        [NameInMap("is_serial")]
        [Validation(Required=false)]
        public bool? IsSerial { get; set; }

    }

}
