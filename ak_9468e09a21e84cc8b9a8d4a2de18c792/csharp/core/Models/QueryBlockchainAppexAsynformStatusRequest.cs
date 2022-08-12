// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9468e09a21e84cc8b9a8d4a2de18c792.Models
{
    public class QueryBlockchainAppexAsynformStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起方账户
        // 
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟ID
        // 
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // 业务单据ID
        // 
        [NameInMap("form_id")]
        [Validation(Required=true)]
        public string FormId { get; set; }

        // 业务单据类型
        // 
        [NameInMap("form_type")]
        [Validation(Required=true)]
        public string FormType { get; set; }

    }

}
