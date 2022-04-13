// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // UID 分片范围
    public class UidRange : TeaModel {
        // UID 起始值
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // UID 终止值
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 弹性
        [NameInMap("elastic")]
        [Validation(Required=false)]
        public bool? Elastic { get; set; }

    }

}
