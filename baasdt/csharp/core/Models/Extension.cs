// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 交易扩展字段
    public class Extension : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public long? Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
