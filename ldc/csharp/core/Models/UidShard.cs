// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // UID 分片
    public class UidShard : TeaModel {
        // UID 起始值
        [NameInMap("min_uid")]
        [Validation(Required=true)]
        public long? MinUid { get; set; }

        // UID 终止值
        [NameInMap("max_uid")]
        [Validation(Required=true)]
        public long? MaxUid { get; set; }

    }

}
