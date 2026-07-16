// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class GetInnerProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户在数科的租户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=32)]
        public string MerchantTenantId { get; set; }

        // 商户统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=199)]
        public string MerchantId { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=true, MaxLength=32)]
        public string ProductId { get; set; }

        // 商品版本
        [NameInMap("product_version")]
        [Validation(Required=true, MaxLength=32)]
        public string ProductVersion { get; set; }

    }

}
