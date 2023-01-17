// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UploadDataflowPubkeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 信封公钥内容
        [NameInMap("pubkey")]
        [Validation(Required=true)]
        public string Pubkey { get; set; }

        // 存证方的租户ID
        [NameInMap("from_tenant")]
        [Validation(Required=true)]
        public string FromTenant { get; set; }

    }

}
