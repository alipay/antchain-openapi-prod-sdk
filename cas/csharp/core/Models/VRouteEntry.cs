// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 路由条目的详细信息。
    public class VRouteEntry : TeaModel {
        // 路由条目的目标网段。
        [NameInMap("desination_cidr_block")]
        [Validation(Required=false)]
        public string DesinationCidrBlock { get; set; }

        // 下一跳的实例ID。
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 下一跳的实例名称。
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 路由条目ID。
        [NameInMap("next_hop_id")]
        [Validation(Required=false)]
        public string NextHopId { get; set; }

        // 路由的下一跳列表。
        [NameInMap("next_hop_item_list")]
        [Validation(Required=false)]
        public List<NextHopItem> NextHopItemList { get; set; }

        // 路由类型。
        // 
        // local：交换机路由。
        // service：云服务路由。
        // classicLink：开启ClassicLink功能后系统自动添加的路由。
        [NameInMap("next_hop_type")]
        [Validation(Required=false)]
        public string NextHopType { get; set; }

        // 路由条目所属路由表的ID。
        [NameInMap("route_table_id")]
        [Validation(Required=false)]
        public string RouteTableId { get; set; }

        // 	
        // 路由条目的状态。
        // 
        // Pending：配置中。
        // Available：可用。
        // Modifying：修改中。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 路由条目的类型。
        // 
        // System：系统路由。
        // Custom：自定义路由。
        // BGP：BGP路由。
        // 
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
