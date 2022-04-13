// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器服务service信息。
    public class NativeServiceView : TeaModel {
        // 服务名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 服务类型。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 负载均衡实例id。
        [NameInMap("load_balancer_id")]
        [Validation(Required=false)]
        public string LoadBalancerId { get; set; }

        // VIP地址信息。
        [NameInMap("vip_addresses")]
        [Validation(Required=false)]
        public List<string> VipAddresses { get; set; }

        // VIP地址信息类型。
        [NameInMap("vip_address_type")]
        [Validation(Required=false)]
        public string VipAddressType { get; set; }

        // ClusterIP信息。
        [NameInMap("cluster_ip")]
        [Validation(Required=false)]
        public string ClusterIp { get; set; }

        // 创建时间。
        [NameInMap("created_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTimestamp { get; set; }

        // 修改时间。
        [NameInMap("modified_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTimestamp { get; set; }

    }

}
