// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryEcarOffsetaccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 碳普惠项目编码
        [NameInMap("project_no")]
        [Validation(Required=true)]
        public string ProjectNo { get; set; }

        // 账户DID
        [NameInMap("account_did")]
        [Validation(Required=true)]
        public string AccountDid { get; set; }

    }

}
