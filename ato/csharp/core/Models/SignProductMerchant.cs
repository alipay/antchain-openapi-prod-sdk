// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 随时享-服务商平台报名商家信息对象
    public class SignProductMerchant : TeaModel {
        // 商户商品spuId
        [NameInMap("merchant_product_id")]
        [Validation(Required=false)]
        public string MerchantProductId { get; set; }

        // 商户品牌
        [NameInMap("merchant_brand")]
        [Validation(Required=false)]
        public string MerchantBrand { get; set; }

        // 商户logo
        [NameInMap("merchant_logo")]
        [Validation(Required=false)]
        public string MerchantLogo { get; set; }

        // 商户logo
        [NameInMap("large_merchant_logo")]
        [Validation(Required=false)]
        public string LargeMerchantLogo { get; set; }

        // 是否置灰
        [NameInMap("grayed")]
        [Validation(Required=false)]
        public bool? Grayed { get; set; }

    }

}
