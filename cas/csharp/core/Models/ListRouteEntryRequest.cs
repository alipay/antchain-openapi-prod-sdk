// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListRouteEntryRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属地域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 要查询的路由条目所属路由表的所属路由器的ID。
        [NameInMap("router_id")]
        [Validation(Required=true)]
        public string RouterId { get; set; }

    }

}
