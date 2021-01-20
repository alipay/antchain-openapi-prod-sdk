// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // SLB 挂载信息
    public class SLBMountInfo : TeaModel {
        // iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // slb id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // SLB 名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // vip 地址
        [NameInMap("vip_addresses")]
        [Validation(Required=false)]
        public List<string> VipAddresses { get; set; }

        // 挂载权重
        [NameInMap("mount_weights")]
        [Validation(Required=false)]
        public List<MountWeight> MountWeights { get; set; }

        // 虚拟服务器组挂载信息
        [NameInMap("v_server_group_mount_info_list")]
        [Validation(Required=false)]
        public List<VServerGroupMountInfo> VServerGroupMountInfoList { get; set; }

    }

}
