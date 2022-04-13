// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 负载均衡实例。
    public class LoadBalancerInstance : TeaModel {
        // 负责均衡iaas id。
        [NameInMap("iaas_id")]
        [Validation(Required=true)]
        public string IaasId { get; set; }

        // 监听器。
        [NameInMap("listeners")]
        [Validation(Required=true)]
        public List<LoadBalancerListener> Listeners { get; set; }

        // 负载均衡名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 负责均衡PAAS id。
        [NameInMap("paas_id")]
        [Validation(Required=false)]
        public string PaasId { get; set; }

        // 负责均衡类型。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 负载均衡vip地址。
        [NameInMap("vip_addresses")]
        [Validation(Required=false)]
        public List<string> VipAddresses { get; set; }

        // 统一接入域名。
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

    }

}
