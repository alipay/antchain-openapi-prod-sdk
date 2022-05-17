// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // 实例信息
    public class Instance : TeaModel {
        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 工作空间
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
