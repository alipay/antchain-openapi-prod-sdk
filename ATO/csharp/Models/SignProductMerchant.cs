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
        /// <summary>
        /// <b>Example:</b>
        /// <para>s123123123123123</para>
        /// </summary>
        [NameInMap("merchant_product_id")]
        [Validation(Required=false)]
        public string MerchantProductId { get; set; }

        // 商户品牌
        /// <summary>
        /// <b>Example:</b>
        /// <para>品牌</para>
        /// </summary>
        [NameInMap("merchant_brand")]
        [Validation(Required=false)]
        public string MerchantBrand { get; set; }

        // 商户logo
        /// <summary>
        /// <b>Example:</b>
        /// <para>filekey</para>
        /// </summary>
        [NameInMap("merchant_logo")]
        [Validation(Required=false)]
        public string MerchantLogo { get; set; }

        // 商户logo
        /// <summary>
        /// <b>Example:</b>
        /// <para>http</para>
        /// </summary>
        [NameInMap("large_merchant_logo")]
        [Validation(Required=false)]
        public string LargeMerchantLogo { get; set; }

        // 是否置灰
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("grayed")]
        [Validation(Required=false)]
        public bool? Grayed { get; set; }

    }

}
