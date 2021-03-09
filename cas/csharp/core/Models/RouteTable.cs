// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 路由表信息
    public class RouteTable : TeaModel {
        // 路由表的创建时间。
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // 路由表所属的路由器类型，取值：
        // 
        // VRouter：VPC路由器。
        // VBR：边界路由器。
        [NameInMap("router_type")]
        [Validation(Required=false)]
        public string RouterType { get; set; }

        // 	
        // 路由条目的详细信息。
        [NameInMap("entry_v_os")]
        [Validation(Required=false)]
        public List<VRouteEntry> EntryVOs { get; set; }

        // 要查询的路由表的ID。
        [NameInMap("route_table_id")]
        [Validation(Required=false)]
        public string RouteTableId { get; set; }

        // 要查询的路由表所属的VPC路由器的ID。
        [NameInMap("v_router_id")]
        [Validation(Required=false)]
        public string VRouterId { get; set; }

    }

}
