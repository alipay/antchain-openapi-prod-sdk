// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditCommonsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 集团平台did
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 签约方did
        [NameInMap("sign_did")]
        [Validation(Required=true)]
        public string SignDid { get; set; }

        // 申请id，不填则查询当前签约状态，填写则查询apply_id对应的签约申请结果
        [NameInMap("apply_id")]
        [Validation(Required=false)]
        public string ApplyId { get; set; }

    }

}
