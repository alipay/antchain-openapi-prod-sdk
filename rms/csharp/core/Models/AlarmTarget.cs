// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 告警对象
    public class AlarmTarget : TeaModel {
        // 告警对象标识:
        [NameInMap("target_identity")]
        [Validation(Required=false)]
        public string TargetIdentity { get; set; }

        // 告警对象类型
        [NameInMap("target_type")]
        [Validation(Required=false)]
        public string TargetType { get; set; }

    }

}
