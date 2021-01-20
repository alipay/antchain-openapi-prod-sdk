// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 挂载权重
    public class MountWeight : TeaModel {
        // 挂载目标 ID
        [NameInMap("mount_target_id")]
        [Validation(Required=false)]
        public string MountTargetId { get; set; }

        // 端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // 权重
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
