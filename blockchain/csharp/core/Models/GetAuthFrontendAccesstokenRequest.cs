// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class GetAuthFrontendAccesstokenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 用户did
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

    }

}
