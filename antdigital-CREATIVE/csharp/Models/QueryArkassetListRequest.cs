// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class QueryArkassetListRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // {"Filter":{"GroupIds":["group-20240514212750-b5e9m"],"GroupType":"AIGC","Statuses":["Active"]},"MaxResults":1,"SortBy":"CreateTime","SortOrder":"Desc","ProjectName":"default"}
        [NameInMap("request_body")]
        [Validation(Required=true)]
        public string RequestBody { get; set; }

    }

}
