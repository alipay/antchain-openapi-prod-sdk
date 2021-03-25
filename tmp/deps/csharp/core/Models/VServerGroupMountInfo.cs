// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 虚拟服务器组挂载信息
    public class VServerGroupMountInfo : TeaModel {
        // iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // paas id
        [NameInMap("paas_id")]
        [Validation(Required=false)]
        public string PaasId { get; set; }

        // 权重信息
        [NameInMap("mount_weights")]
        [Validation(Required=false)]
        public List<MountWeight> MountWeights { get; set; }

    }

}
