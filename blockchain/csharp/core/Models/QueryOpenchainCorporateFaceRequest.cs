// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryOpenchainCorporateFaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 认证id
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 租户code
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户code
        [NameInMap("merchant_code")]
        [Validation(Required=true)]
        public string MerchantCode { get; set; }

    }

}
