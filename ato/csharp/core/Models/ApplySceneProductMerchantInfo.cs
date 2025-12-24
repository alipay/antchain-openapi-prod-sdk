// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 随时享-服务商平台适用商家选择配置信息
    public class ApplySceneProductMerchantInfo : TeaModel {
        // 商户商品spuId
        [NameInMap("merchant_product_id")]
        [Validation(Required=false)]
        public string MerchantProductId { get; set; }

        // 商户品牌
        [NameInMap("merchant_brand")]
        [Validation(Required=false)]
        public string MerchantBrand { get; set; }

        // logo
        [NameInMap("merchant_logo")]
        [Validation(Required=false)]
        public string MerchantLogo { get; set; }

        // logo
        [NameInMap("large_merchant_logo")]
        [Validation(Required=false)]
        public string LargeMerchantLogo { get; set; }

        // 是否置灰
        [NameInMap("grayed")]
        [Validation(Required=false)]
        public bool? Grayed { get; set; }

        // 是否勾选
        [NameInMap("choosed")]
        [Validation(Required=false)]
        public bool? Choosed { get; set; }

    }

}
