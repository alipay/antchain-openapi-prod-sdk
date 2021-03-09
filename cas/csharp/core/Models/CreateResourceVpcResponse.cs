// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateResourceVpcResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 创建VPC后，系统自动创建的路由表的ID。
        [NameInMap("route_table_id")]
        [Validation(Required=false)]
        public string RouteTableId { get; set; }

        // 创建的VPC的ID
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // 创建VPC后，系统自动创建的路由器的ID。
        [NameInMap("v_router_id")]
        [Validation(Required=false)]
        public string VRouterId { get; set; }

    }

}
