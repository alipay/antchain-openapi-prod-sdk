// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务具体同步的数据
    public class SyncData : TeaModel {
        // 源数据
        [NameInMap("source_data")]
        [Validation(Required=true)]
        public string SourceData { get; set; }

        // 目标数据
        [NameInMap("target_data")]
        [Validation(Required=true)]
        public string TargetData { get; set; }

    }

}
