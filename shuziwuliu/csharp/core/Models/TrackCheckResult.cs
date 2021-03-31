// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 轨迹核验结果
    public class TrackCheckResult : TeaModel {
        // 轨迹核验状态code
        [NameInMap("track_check_status")]
        [Validation(Required=false)]
        public string TrackCheckStatus { get; set; }

        // 轨迹核验结果描述
        [NameInMap("track_check_status_msg")]
        [Validation(Required=false)]
        public string TrackCheckStatusMsg { get; set; }

    }

}
