// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CancelCreditIssuebatchbysaasRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次号
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 集团平台did
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 凭证发行方did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

    }

}
