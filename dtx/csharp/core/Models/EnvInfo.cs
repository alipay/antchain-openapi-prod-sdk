// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 环境信息
    public class EnvInfo : TeaModel {
        // 环境
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 是否公有云环境
        [NameInMap("is_public_cloud")]
        [Validation(Required=true)]
        public bool? IsPublicCloud { get; set; }

        // 租户
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // server / client
        [NameInMap("recovery_mode")]
        [Validation(Required=true)]
        public string RecoveryMode { get; set; }

    }

}
