// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // the uid shard list.
    public class UidShardList : TeaModel {
        // the uid shard list.
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<UidShard> Data { get; set; }

    }

}
