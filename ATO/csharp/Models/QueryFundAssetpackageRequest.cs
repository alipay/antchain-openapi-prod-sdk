// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryFundAssetpackageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true, MaxLength=200)]
        public string FundId { get; set; }

        // 商家统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=200)]
        public string MerchantId { get; set; }

        // 商户的租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true, MaxLength=10)]
        public string TenantId { get; set; }

        // 用信id
        [NameInMap("utilization_id")]
        [Validation(Required=false, MaxLength=32)]
        public string UtilizationId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=true, MaxLength=64)]
        public string AssetPackageId { get; set; }

    }

}
