// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryPromoteActivityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 助力活动的活动规则编码
        [NameInMap("promote_id")]
        [Validation(Required=true)]
        public string PromoteId { get; set; }

        // 用户授权token
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

    }

}
