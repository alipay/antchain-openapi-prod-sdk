// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateVpcVroutertableRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标网端
        [NameInMap("destination_cidr_block")]
        [Validation(Required=true)]
        public string DestinationCidrBlock { get; set; }

        // 下一跳资源 id
        [NameInMap("next_hop_id")]
        [Validation(Required=true)]
        public string NextHopId { get; set; }

        // 下一跳类型
        [NameInMap("next_hop_type")]
        [Validation(Required=true)]
        public string NextHopType { get; set; }

        // 路由表 id
        [NameInMap("v_route_table_id")]
        [Validation(Required=true)]
        public string VRouteTableId { get; set; }

        // vpc paas id
        [NameInMap("vpc_sequence")]
        [Validation(Required=true)]
        public string VpcSequence { get; set; }

    }

}
