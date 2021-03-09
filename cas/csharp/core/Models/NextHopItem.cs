// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 路由的下一跳详细信息。
    public class NextHopItem : TeaModel {
        // 	
        // 下一跳的类型。
        // 
        // Instance：ECS实例。
        // HaVip：高可用虚拟IP。
        // VpnGateway：VPN网关。
        // NatGateway：NAT网关。
        // NetworkInterface：辅助弹性网卡。
        // RouterInterface：路由器接口。
        // IPv6Gateway：IPv6网关。
        [NameInMap("next_hop_type")]
        [Validation(Required=false)]
        public string NextHopType { get; set; }

        // 下一跳实例的ID。
        [NameInMap("next_hop_id")]
        [Validation(Required=false)]
        public string NextHopId { get; set; }

        // 是否启用下一跳。
        // 
        // 0：不启用。
        // 1：启用。
        [NameInMap("enable")]
        [Validation(Required=false)]
        public long? Enable { get; set; }

        // 下一跳的路由权重。
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
