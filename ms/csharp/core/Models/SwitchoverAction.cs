// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 切换动作
    public class SwitchoverAction : TeaModel {
        // 目标单元
        [NameInMap("dest_cell")]
        [Validation(Required=false)]
        public string DestCell { get; set; }

        // 来源单元
        [NameInMap("source_cell")]
        [Validation(Required=false)]
        public string SourceCell { get; set; }

    }

}
