// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryVpcVroutertableRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // vpc id
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // 路由器id
        [NameInMap("v_router_id")]
        [Validation(Required=true)]
        public string VRouterId { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
