// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateOpenchainWebsitServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户code,如法人的唯一id
        [NameInMap("merchant_code")]
        [Validation(Required=true)]
        public string MerchantCode { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 租户code
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
