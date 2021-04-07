// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateResourceVpcResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
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
