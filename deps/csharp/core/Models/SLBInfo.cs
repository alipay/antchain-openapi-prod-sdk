// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // SLB 信息
    public class SLBInfo : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 机器ID
        [NameInMap("machine_id")]
        [Validation(Required=false)]
        public string MachineId { get; set; }

        // 端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // paas id
        [NameInMap("paas_id")]
        [Validation(Required=false)]
        public string PaasId { get; set; }

        // iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 虚拟服务器组 id
        [NameInMap("v_server_group_id")]
        [Validation(Required=false)]
        public string VServerGroupId { get; set; }

        // 虚拟服务器组名
        [NameInMap("v_server_group_name")]
        [Validation(Required=false)]
        public string VServerGroupName { get; set; }

        // 计算资源 ID
        [NameInMap("computer_id")]
        [Validation(Required=false)]
        public string ComputerId { get; set; }

        // 应用 ID
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 应用服务 ID
        [NameInMap("app_svc_id")]
        [Validation(Required=false)]
        public string AppSvcId { get; set; }

        // vip 地址列表
        [NameInMap("vip_addresses")]
        [Validation(Required=false)]
        public List<string> VipAddresses { get; set; }

        // 权重
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
