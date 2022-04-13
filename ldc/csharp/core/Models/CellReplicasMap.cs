// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 每个cell副本数map
    public class CellReplicasMap : TeaModel {
        // cell name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 副本数
        [NameInMap("replicas")]
        [Validation(Required=true)]
        public long? Replicas { get; set; }

    }

}
